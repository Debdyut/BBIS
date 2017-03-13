package ApplicationHandler;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import DatabaseHandler.DatabaseHandler;

public class MainFrame {
	
	DatabaseHandler dh;
	
	JFrame jfrm;	
	JPanel jp;
	CardLayout cd;
	
	public MainFrame(DatabaseHandler dh) {
		this.dh = dh;
		
		initComponents();
	}
	
	public void initComponents() {
		jfrm = new JFrame();
		jfrm.setTitle("Blood Bank Information System");
		jfrm.setSize(1280, 720);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
		
		
		if(ApplicationData.type.equals("blood_bank")) {				
		
		BBHomePage jpn = new BBHomePage(dh);
		
		jfrm.setJMenuBar(jpn.getMenuBar());
				
		
		jfrm.add(jpn, BorderLayout.CENTER);
		
		}
		
		else {
			
			HHomePage hpn = new HHomePage(dh);
			
			jfrm.setJMenuBar(hpn.getMenuBar());
			
			
			jfrm.add(hpn, BorderLayout.CENTER);
			
		}
		
		
	}
	
}
