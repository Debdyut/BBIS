import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import ApplicationHandler.Login;

public class StartApp {

	public static void main(String args[]) {
		try {
			
			
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		
		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
		    public void run() {
		        Login dialog = new Login(new javax.swing.JFrame(), true);
		        dialog.setTitle("Login");
		        dialog.setSize(500, 280);
		        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		        dialog.setVisible(true);
		    }
		});


	}

}
