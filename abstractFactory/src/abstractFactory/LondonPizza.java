package abstractFactory;

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
		
		PizzaIngredientFactory ingredientFactory = new LondonPizzaIngredientFactory(); // al wsfa
		
		if(t.equals("cheese")) {
			pizza = new cheesePizza(ingredientFactory);
		}
		else if(t.equals("pepperoni")) {
			pizza = new pepperoniPizza(ingredientFactory);
		}
		else if(t.equals("clam")) {
			pizza = new clamPizza(ingredientFactory);
		}
		
		return pizza;
	}

}