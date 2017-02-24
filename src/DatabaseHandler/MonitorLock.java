package DatabaseHandler;

public class MonitorLock implements Runnable {
	
	public Thread t;
	
	DatabaseHandler dh;
	String sqlStatement, task;
	
	public MonitorLock(String sqlStatement, String task, DatabaseHandler dh) {
		this.sqlStatement = sqlStatement;
		this.task = task;
		this.dh = dh;
		
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
			
			synchronized(dh) {
				
				if(task.equals("update")) {
					//System.out.println("Updating");					
					dh.update(sqlStatement);					
				}								
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
