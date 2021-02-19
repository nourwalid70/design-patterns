
public abstract class tester {

	public static void main(String[] args) {
	
		Sosa s = new Sosa();
		IObserver s1 = new shyLovers("ali",s);
		IObserver s2 = new shyLovers("mostafa",s);
		IObserver a1 = new activeLovers("kareem",s);
		s.setNewInfo("Nada", true);	
		s.HaveNewInfo();
		System.out.println("-----------------------");
		s.unsubscribe(s2);
		s.setNewInfo("Nada", false);	
		s.HaveNewInfo();
		

	}

}
