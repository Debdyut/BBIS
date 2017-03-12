package ApplicationHandler;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import DatabaseHandler.DatabaseHandler;

public class SearchInventoryPanel extends JPanel {
	
	private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
	DefaultTableModel tableModel;
	private javax.swing.JButton jButton1;
    // End of variables declaration
	
	DatabaseHandler dh;
	ResultSet rs;
	
	public SearchInventoryPanel(DatabaseHandler dh) {
		
		this.dh = dh;
		
		initComponents();
		
	}
	
	private void initComponents() {
		
		jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        //jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Search Inventory");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Group: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel3.setText("RH:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positive", "Negative" }));
        
        jLabel4.setText("Type:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Whole Blood", "Component" }));
        
        jComboBox3.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//System.out.println(jComboBox3.getSelectedItem()); 
				
				if(jComboBox3.getSelectedItem().equals("Component")) {
					jComboBox4.setEnabled(true);
				}
				else {
					jComboBox4.setEnabled(false);
				}
			}
        	
        });

        jLabel5.setText("Component:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Applicable","Packed Red Cell","Platelet Concentrate","Fresh Frozen Plasma","Cyro Precipitate" }));        
        
        jComboBox4.setEnabled(false);
        
        jButton1.setText("Search"); jButton1.addActionListener(new ActionListener () {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				searchInventory();
			}
        	
        });
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap()
                )
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(jButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

               
        String[] colHeads = {"Bag Number", "Blood Group", "RH", "Type", "Component", "Donor ID", "Date of Collection", "Expiry Date", ""};
        
        tableModel = new DefaultTableModel(colHeads, 0);
        
        jTable1 = new javax.swing.JTable(tableModel);
        
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {        	        	       	
        	
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	int row = jTable1.rowAtPoint(evt.getPoint());
                int col = jTable1.columnAtPoint(evt.getPoint());                
                if(col == 8) {
                	
                	IssueBlood dialog = new IssueBlood(new javax.swing.JFrame(), true, dh, jComboBox1.getSelectedItem().toString(), jComboBox2.getSelectedItem().toString(), jComboBox3.getSelectedItem().toString(), jComboBox4.getSelectedItem().toString(), jTable1.getValueAt(row, 0).toString());
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    dialog.setTitle("Issue Blood");
                    dialog.setVisible(true);
                	
                    searchInventory();
                	
                }
            }
        });
        
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
		
	}

	
	
	private void searchInventory() {
		
		String sqlStatement;
		
		StringBuilder query = new StringBuilder();
		query.append("select blood_bag_number, abo, rh, type, Component, donorid, date_of_collection, expiry_date from blood_inventory where ");		
		query.append("bbid = '" + ApplicationData.bbID + "'");
		query.append(" and ");
		query.append("abo = '" + jComboBox1.getSelectedItem().toString() + "'");
		query.append(" and ");
		query.append("rh = '" + jComboBox2.getSelectedItem().toString() + "'");
		query.append(" and ");
		query.append("type = '" + jComboBox3.getSelectedItem().toString() + "'");
		if(jComboBox3.getSelectedItem().toString().equals("Component")) {
			query.append(" and ");		
			query.append("Component = '" + jComboBox4.getSelectedItem().toString() + "'");
		}
		
		sqlStatement = query.toString();		
		
		while (tableModel.getRowCount() > 0) {
			tableModel.removeRow(0);
		}
		
		try {
			rs = dh.read(sqlStatement);						
			
			while(rs.next()) {
			
				Object[] obj =  new Object[9];
				obj[0] = rs.getString(1);
				obj[1] = rs.getString(2);
				obj[2] = rs.getString(3);
				obj[3] = rs.getString(4);
				obj[4] = rs.getString(5);
				obj[5] = rs.getString(6);
				obj[6] = rs.getDate(7).toString();
				obj[7] = rs.getDate(8).toString();
				obj[8] = "Issue";
				
				tableModel.addRow(obj);
				
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
