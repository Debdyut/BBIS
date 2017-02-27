package ApplicationHandler;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TaskListPanel {

	JPanel jp;
	
	public TaskListPanel (JPanel jp) {
		this.jp = jp;
		
		initComponents();
	}
	
	private void initComponents() {
		
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		
		jp.setBackground(Color.WHITE);
				
		
		
		Font font = new Font("Times New Roman", 1, 20);
		
		jp.setFont(font);
		
		jp.add(new JLabel("Search Inventory"));
		
		jp.add(Box.createRigidArea(new Dimension(0, 10)));
		
		jp.add(new JLabel("Search Donor"));
		
		jp.add(Box.createRigidArea(new Dimension(0,10)));
		
		jp.add(new JLabel("View Blood Transaction History"));
		
		
		
	}
	
}
