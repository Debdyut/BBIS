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
		
		try {
			initComponents();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void initComponents() throws InterruptedException {
		
		
		
		cd = new CardLayout();		
		jp.setLayout(cd);
		
		jp.setBackground(new Color(240, 230, 230));
		
		SearchInventoryPanel si = new SearchInventoryPanel(dh);
		
		Thread.sleep(1000);
		
		jp.add("Search Inventory", si);
		
		FindBlood fb = new FindBlood(dh);
		
		Thread.sleep(1000);
		
		jp.add("General Blood Search", fb);
		
		SearchDonorPanel sd = new SearchDonorPanel(dh);		
		
		Thread.sleep(1000);
		
		jp.add("Search Donor", sd);
		
		BloodIssueHistoryPanel bihp = new BloodIssueHistoryPanel(dh);
		
		Thread.sleep(1000);
		
		jp.add("Blood Issue History", bihp);
		
				
		cd.show(jp, "Search Inventory");
						
	}
	
	void changePanel(String panelName) {
		cd.show(jp, panelName);
	}
	
}
