
abstract class PizzaStore {

	Pizza orderPizza(String...type) {
		
		Pizza pizza = creatPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println(pizza.ToString());
		
		return pizza;

	}
	
	protected abstract Pizza creatPizza(String...type); // from zero to more type
	
}
