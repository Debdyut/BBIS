package ApplicationHandler;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TaskListPanel {

	JPanel jp;
	JLabel li1, li2, li3;
	
	QueryPanel qp;
	
	public TaskListPanel (JPanel jp, QueryPanel qp) {
		this.jp = jp;
		this.qp = qp;
		initComponents();
	}
	
	private void initComponents() {
		
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		
		jp.setBackground(Color.WHITE);
				
		li1 = new JLabel("Search Inventory"); li1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		li2 = new JLabel("Search Donor"); li2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		li3 = new JLabel("View Blood Transaction History"); li3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		li1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				qp.changePanel("Search Inventory");
				//System.out.println("Search Inventory");
			}
			
		});
		
		li2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				qp.changePanel("Search Donor");
				//System.out.println("Search Donor");
			}
		});
		
		li3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//qp.changePanel("");
				System.out.println("Transaction History");
			}
		});
		
		Font font = new Font("Times New Roman", 1, 20);
		
		jp.setFont(font);
		
		jp.add(li1);
		
		jp.add(Box.createRigidArea(new Dimension(0, 10)));
		
		jp.add(li2);
		
		jp.add(Box.createRigidArea(new Dimension(0,10)));
		
		jp.add(li3);
		
		
		
	}
	
}
