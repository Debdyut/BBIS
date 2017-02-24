package ApplicationHandler;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import DatabaseHandler.DatabaseHandler;

public class BBHomePage extends JPanel implements ActionListener {

	JPanel jp;
	CardLayout cd;
	
	JMenuBar jmb;
	JMenu jmFile, jmNew;
	JMenuItem jmiBloodBag, jmiDonor, jmiPatient, jmiExit;
	
	DatabaseHandler dh;
	
	public BBHomePage(JPanel jp, CardLayout cd, DatabaseHandler dh) {
		this.jp = jp;
		this.cd = cd;
		this.dh = dh;
		
		initComponents();
	}
	
	public void initComponents() {
		
		createMenuBar();
		
		
		
	}
	
	private void createMenuBar() {
		jmb = new JMenuBar();
		jmFile = new JMenu("File");
		
		jmNew = new JMenu("New");
		jmiBloodBag = new JMenuItem("Blood Unit"); jmiBloodBag.addActionListener(this);
		jmiDonor = new JMenuItem("Donor"); jmiDonor.addActionListener(this);
		jmiPatient = new JMenuItem("Patient"); 
		jmNew.add(jmiBloodBag);
		jmNew.add(jmiDonor);
		jmNew.add(jmiPatient);
		
		jmiExit = new JMenuItem("Exit"); jmiExit.addActionListener(this);
		
		jmFile.add(jmNew);
		jmFile.add(jmiExit);
		
		jmb.add(jmFile);
	}
	
	public JMenuBar getMenuBar() {
		return jmb;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		
		if(s.equals("Blood Unit")) {
			java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                AddBloodUnit dialog = new AddBloodUnit(new javax.swing.JFrame(), true, dh);	                
	                dialog.setTitle("Add Blood Unit");
	                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	                dialog.setVisible(true);
	            }
	        });
		}
		else if(s.equals("Donor")) {
			java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                AddDonor dialog = new AddDonor(new javax.swing.JFrame(), true, dh);	                
	                dialog.setTitle("Add Donor");
	                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	                dialog.setVisible(true);
	            }
	        });
		}
		else if(s.equals("Exit")) {
			System.exit(0);
		}
		
	}
	
}
