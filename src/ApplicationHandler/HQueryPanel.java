package ApplicationHandler;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import DatabaseHandler.DatabaseHandler;

public class HQueryPanel extends QueryPanel {

	public HQueryPanel(JPanel jp, DatabaseHandler dh) {
		super(jp, dh);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void initComponents() {
		
		
		
		cd = new CardLayout();		
		jp.setLayout(cd);
		
		jp.setBackground(new Color(240, 230, 230));
		
		FindBlood si = new FindBlood(dh);
		
		jp.add("Search for Blood", si);
		
		SearchDonorPanel sd = new SearchDonorPanel(dh);
		
		jp.add("Search Donor", sd);
								
		cd.show(jp, "Search for Blood");
						
	}
	
}
