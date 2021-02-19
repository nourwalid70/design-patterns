
public class tester1 {

	public static void main(String[] args) {
		
		
		System.out.println(Singleton.Get());
		System.out.println(Singleton.x);
		
		
		System.out.println(eagerSingleton.s);
		eagerSingleton.Get();
		System.out.println(eagerSingleton.s);
		
		System.out.println("---------------------------------------");
		for(int i=0 ; i<10 ; i++) {
			eagerSingleton.Get();
			System.out.println(eagerSingleton.s);
		}
		System.out.println("---------------------------------------");	
		for(int i=0 ; i<10 ; i++) {
			Singleton.Get();
			System.out.println(Singleton.s);
		}
		System.out.println("---------------------------------------");
		for(int i=0 ; i<10 ; i++) {
			SynchronizationSingleton.Get();
			System.out.println(SynchronizationSingleton.s);
		}
		
		
	}
}
