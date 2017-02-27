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
		jfrm.setTitle("Blood Bank Management System");
		jfrm.setSize(1280, 720);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
		
		cd = new CardLayout();
		
		jp = new JPanel();
		jp.setLayout(cd);
		
		jfrm.add(jp, BorderLayout.CENTER);
		
		BBHomePage jpn = new BBHomePage(jp, cd, dh);
		
		jfrm.setJMenuBar(jpn.getMenuBar());
		
		jp.add("Blood Bank", jpn);
		
		cd.show(jp, "Blood Bank");
		
	}
	
}
