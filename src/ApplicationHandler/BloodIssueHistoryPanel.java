package ApplicationHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import DatabaseHandler.DatabaseHandler;

public class BloodIssueHistoryPanel extends JPanel implements Runnable{

	private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
    
    DatabaseHandler dh;
    ResultSet rs;
    DefaultTableModel tableModel;
    
    Thread th;
    
    public BloodIssueHistoryPanel(DatabaseHandler dh) {
    	this.dh = dh;    	
    	    		
        initComponents();
        
        th = new Thread(this);
        
        th.start();
        
        //populateTable();
    }
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Blood Issue History");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        String[] colHeads = {"Bag Number", "Blood Group", "RH", "Type", "Component", "Health Center", "Doctor", "Patient", "Age", "Gender", "Requisition Date", "Indication of Transfusion"};
        
        tableModel = new DefaultTableModel(colHeads, 0);
        
        jTable1 = new javax.swing.JTable(tableModel);
        
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
    }
    
    private void populateTable() {
    	
    	String sqlStatement;
		
		StringBuilder query = new StringBuilder();
		query.append("SELECT `bag_no`, `blood_group`, `rh`, `type`, `component`, `health_center`, `doctor_name`, `patient_name`, `p_age`, `p_gender`, `p_req_date`, `indication_of_transfusion` FROM `blood_transaction` where ");		
		query.append("bbid = '" + ApplicationData.bbID + "'");
		query.append(" ORDER BY blood_group ASC");
		
		sqlStatement = query.toString();	
    	
			
    	while (tableModel.getRowCount() > 0) {
			tableModel.removeRow(0);
		}
    	
    	try {
			rs = dh.read(sqlStatement);						
			
			while(rs.next()) {
			
				Object[] obj =  new Object[12];
				obj[0] = rs.getString(1); // bag number
				obj[1] = rs.getString(2); // blood group
				obj[2] = rs.getString(3); // rh
				obj[3] = rs.getString(4); // type
				obj[4] = rs.getString(5); // component
				obj[5] = rs.getString(6); // health center
				obj[6] = rs.getString(7); // doctor
				obj[7] = rs.getString(8); // patient
				obj[8] = rs.getInt(9);	  // age
				obj[9] = rs.getString(10); // gender
				obj[10] = rs.getDate(11).toString(); // requisition date
				obj[11] = rs.getString(12); // indication of transfusion				
				
				tableModel.addRow(obj);
				
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

	@Override
	public void run() {		
		
		populateTable();
		
		try {
			Thread.sleep(10000); // Updates view after every 10 seconds
			run();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
