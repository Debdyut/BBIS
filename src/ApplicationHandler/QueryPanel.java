package ApplicationHandler;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QueryPanel {

	
	
	JPanel jp;
	CardLayout cd;
	
	public QueryPanel(JPanel jp) {
		

		this.jp = jp;
		
		initComponents();
		
	}
	
	private void initComponents() {
		
		
		
		cd = new CardLayout();		
		jp.setLayout(cd);
		
		jp.setBackground(new Color(240, 230, 230));
		
		SearchInventoryPanel si = new SearchInventoryPanel();
		
		jp.add("Search Inventory", si);
		
		
		cd.show(jp, "Search Inventory");
				
		
	}
	
}
