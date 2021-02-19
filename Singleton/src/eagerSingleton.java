
public class eagerSingleton {
	
	static eagerSingleton s; 
	
	// ------------------------------------------------------------------ //
		// will create within the run of program without "new"
	
	private eagerSingleton() {
		
	}
	
	public static eagerSingleton Get() {
		
		if(s == null)
			s = new eagerSingleton(); // first creation
		
		return s;
	}
	
}
