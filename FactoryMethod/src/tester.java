
public class tester {
	public static void main(String[] args) {
		
		
		/*NYclamPizza p1 = new NYclamPizza();
		System.out.println(p1.ToString());*/
		

		PizzaStore p2 = new NYPizza();
		Pizza pizza = p2.orderPizza("clam");
		System.out.println(pizza);
		
		
	}

}
