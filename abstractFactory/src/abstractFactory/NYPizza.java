package abstractFactory;

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
		
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory(); // al wsfa
		
		if(t.equals("cheese")) {
			pizza = new cheesePizza(ingredientFactory);
			//pizza.setName("");
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
