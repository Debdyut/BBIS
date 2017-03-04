package ApplicationHandler;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import DatabaseHandler.DatabaseHandler;

public class QueryPanel {

	
	
	JPanel jp;
	CardLayout cd;
	
	DatabaseHandler dh;
	
	public QueryPanel(JPanel jp, DatabaseHandler dh) {
		
		this.dh = dh;

		this.jp = jp;
		
		initComponents();
		
	}
	
	private void initComponents() {
		
		
		
		cd = new CardLayout();		
		jp.setLayout(cd);
		
		jp.setBackground(new Color(240, 230, 230));
		
		SearchInventoryPanel si = new SearchInventoryPanel(dh);
		
		jp.add("Search Inventory", si);
		
		
		cd.show(jp, "Search Inventory");
				
		
	}
	
}
