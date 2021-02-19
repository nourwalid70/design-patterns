
public class tester {

	public static void main(String[] args) {

		Person p = new RealPerson(25,"female");

		Person p1 = new OwnProxyPerson(p);
		System.out.println(p1.getAge());
		p1.Rate(5);
		System.out.println(p1.getAveRate());
		
		Person p2 = new OtherProxyPerson(p);
		p2.Rate(5);
		p2.setGender("male");
		System.out.println(p2.getAveRate());
		System.out.println(p2.getNumOfRaters());
		System.out.println(p2.getGender());
	}

}
