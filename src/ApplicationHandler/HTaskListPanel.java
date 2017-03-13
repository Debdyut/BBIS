package ApplicationHandler;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HTaskListPanel extends TaskListPanel {

	public HTaskListPanel(JPanel jp, QueryPanel qp) {
		super(jp, qp);
		// TODO Auto-generated constructor stub
	}
	
	public void initComponents() {
		
		
		
		li1 = new JLabel("Search for Blood"); li1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		li2 = new JLabel("Search Donor"); li2.setCursor(new Cursor(Cursor.HAND_CURSOR));		
		
		li1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				qp.changePanel("Search for Blood");				
			}
			
		});
		
		li2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				qp.changePanel("Search Donor");			
			}
		});
		
		
		Font font = new Font("Times New Roman", 1, 20);
		
		jp.setFont(font);
		
		jp.add(li1);
		
		jp.add(Box.createRigidArea(new Dimension(0, 10)));
		
		jp.add(li2);
		
			
		
		
	}

}
