
public class Singleton {
	
	static Singleton s = new Singleton(); // s daman >>> one "new" 
	public  static int x=5;

	// ------------------------------------------------------------------ //
	// will create within the run of program !

	private Singleton() {
		
	}
	
	public static Singleton Get() {
		
		return s;
	}
	
	
}
