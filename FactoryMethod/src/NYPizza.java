
public class NYPizza extends PizzaStore{

	protected Pizza creatPizza(String... type) {
		String t;
		if(type.length>0) {
			t = type[0];
		}
		else {
			t = "cheese";
		}
		Pizza pizza = null;
		
		if(t.equals("cheese")) {
			pizza = new NYcheesePizza();
		}
		else if(t.equals("pepperoni")) {
			pizza = new NYpepperoniPizza();
		}
		else if(t.equals("clam")) {
			pizza = new NYclamPizza();
		}
		
		return pizza;
	}

}
