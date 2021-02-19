
public class tester {

	public static void main(String[] args) {

    template t1 = new Tea(true);
    t1.prepare();
		
    System.out.println("---------------------------");
    
    template c1 = new Coffe(false);
    c1.prepare();
	}

}
