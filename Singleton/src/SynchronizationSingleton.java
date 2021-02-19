
public class SynchronizationSingleton {
	
	static volatile SynchronizationSingleton s; 
	
	// ------------------------------------------------------------------ //
		// will create within the run of program without "new"
	
	private SynchronizationSingleton() {
		
	}
	
	/*public static synchronized SynchronizationSingleton Get() { // Synchronization >> perform less 100 
		
		if(s == null)
			s = new SynchronizationSingleton(); // first creation
		
		return s;
	}
	*/
	
public static SynchronizationSingleton Get() { 
		
		if(s == null) {
			synchronized(SynchronizationSingleton.class) { // Lock
				if(s == null)	
			s = new SynchronizationSingleton(); // first creation
				else {
					return s;
				}
		      }
			}
		return s;
	}
	
	
	
}
