package ApplicationHandler;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import DatabaseHandler.DatabaseHandler;

public class HHomePage extends BBHomePage {

	HQueryPanel qp; 
	HTaskListPanel tlp;
	
	public HHomePage(DatabaseHandler dh) {
		super(dh);
		
	}
	
	public void createMenuBar() {
		jmb = new JMenuBar();
		jmFile = new JMenu("File");
		
		jmNew = new JMenu("New");
		jmiDonor = new JMenuItem("Donor"); jmiDonor.addActionListener(this); 
		jmNew.add(jmiDonor);
		
		jmiExit = new JMenuItem("Exit"); jmiExit.addActionListener(this);
		
		jmFile.add(jmNew);
		jmFile.add(jmiExit);
		
		jmb.add(jmFile);
		
		jmOptions = new JMenu("Options");
		jmiChangePassword = new JMenuItem("Change Password"); jmiChangePassword.addActionListener(this);
		jmOptions.add(jmiChangePassword);
		
		jmb.add(jmOptions);
		
	}	
	
	public void specialInit() {		
		qp = new HQueryPanel(jPanel5, dh);
		tlp = new HTaskListPanel(jPanel6, qp);
	}

}
