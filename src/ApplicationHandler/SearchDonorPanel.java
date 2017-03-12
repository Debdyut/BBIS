package ApplicationHandler;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import DatabaseHandler.DatabaseHandler;

public class SearchDonorPanel extends JPanel {

	private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    DefaultTableModel tableModel;
    // End of variables declaration   
    
    DatabaseHandler dh;
    ResultSet rs;
    
    public SearchDonorPanel(DatabaseHandler dh) {
    	
    	this.dh = dh;
    	
        initComponents();
    }
    
    private void initComponents() {
    
	    jPanel1 = new javax.swing.JPanel();
	    jPanel2 = new javax.swing.JPanel();
	    jLabel1 = new javax.swing.JLabel();
	    jPanel3 = new javax.swing.JPanel();
	    jLabel2 = new javax.swing.JLabel();
	    jComboBox1 = new javax.swing.JComboBox<>();
	    jLabel3 = new javax.swing.JLabel();
	    jComboBox2 = new javax.swing.JComboBox<>();
	    jButton1 = new javax.swing.JButton();
	    jScrollPane1 = new javax.swing.JScrollPane();
	    jTable1 = new javax.swing.JTable();
	    
	
	    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
	    jLabel1.setText("Search Donor");
	
	    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	    jPanel2.setLayout(jPanel2Layout);
	    jPanel2Layout.setHorizontalGroup(
	        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel2Layout.createSequentialGroup()
	            .addContainerGap()
	            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	    );
	    jPanel2Layout.setVerticalGroup(
	        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel2Layout.createSequentialGroup()
	            .addContainerGap()
	            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addContainerGap())
	    );
	
	    jLabel2.setText("Group: ");
	
	    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
	
	    jLabel3.setText("RH:");
	
	    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positive", "Negative" }));    
	
	    jButton1.setText("Search"); jButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				searchDonor();
				
			}
	    	
	    });
	
	    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	    jPanel3.setLayout(jPanel3Layout);
	    jPanel3Layout.setHorizontalGroup(
	        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel3Layout.createSequentialGroup()
	            .addContainerGap()
	            .addComponent(jLabel2)
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	            .addComponent(jLabel3)
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addGap(18, 18, 18)
	            .addComponent(jButton1)
	            .addContainerGap(27, Short.MAX_VALUE))
	    );
	    jPanel3Layout.setVerticalGroup(
	        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel3Layout.createSequentialGroup()
	            .addContainerGap()
	            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                .addComponent(jLabel2)
	                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(jLabel3)
	                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addComponent(jButton1))
	            .addContainerGap(21, Short.MAX_VALUE))
	    );
	
	    String[] colHeads = {"Name", "Age", "Gender", "Phone", "Email"};
        
        tableModel = new DefaultTableModel(colHeads, 0);
        
        jTable1 = new javax.swing.JTable(tableModel);
	    jScrollPane1.setViewportView(jTable1);
	
	    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	    jPanel1.setLayout(jPanel1Layout);
	    jPanel1Layout.setHorizontalGroup(
	        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel1Layout.createSequentialGroup()
	            .addContainerGap()
	            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
	                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createSequentialGroup()
	                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGap(0, 0, Short.MAX_VALUE)))
	            .addContainerGap())
	    );
	    jPanel1Layout.setVerticalGroup(
	        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGroup(jPanel1Layout.createSequentialGroup()
	            .addContainerGap()
	            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
	            .addContainerGap())
	    );
	
	    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	    this.setLayout(layout);
	    layout.setHorizontalGroup(
	        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGap(0, 717, Short.MAX_VALUE)
	        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE)))
	    );
	    layout.setVerticalGroup(
	        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        .addGap(0, 401, Short.MAX_VALUE)
	        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE)))
	    );
    }

    
    void searchDonor() {
    	
    	String sqlStatement;
		
		StringBuilder query = new StringBuilder();
		query.append("select name, age, sex, phone, email from donor_list where ");		
		query.append("blood_group = '" + jComboBox1.getSelectedItem().toString() + "'");
		query.append(" and ");
		query.append("rh = '" + jComboBox2.getSelectedItem().toString() + "'");		
		
		sqlStatement = query.toString();				
		
		while (tableModel.getRowCount() > 0) {
			tableModel.removeRow(0);
		}
		
		try {
			rs = dh.read(sqlStatement);						
			
			while(rs.next()) {
			
				Object[] obj =  new Object[5];
				obj[0] = rs.getString(1);				
				obj[1] = rs.getInt(2);
				obj[2] = rs.getString(3);
				obj[3] = rs.getString(4);
				obj[4] = rs.getString(5);							
				
				tableModel.addRow(obj);
				
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
	
}
