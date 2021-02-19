
public class LondonPizza extends PizzaStore{

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
			pizza = new LcheesePizza();
		}
		else if(t.equals("pepperoni")) {
			pizza = new LpepperoniPizza();
		}
		else if(t.equals("clam")) {
			pizza = new LclamPizza();
		}
		
		return pizza;
	}

}