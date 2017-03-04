package ApplicationHandler;

public class DonorCodeGenerator {
	
	String id;
	static String ida;
	static String idb;

	static {
		ida = "D";
		idb = "0000000000";	
	}	

	public DonorCodeGenerator() {
		System.out.println("Generating code ...");		
	}	

	
	public String generateCode(int donorCount) {
		idb = idb + donorCount;
		return ( ida + idb );
	}
	
}