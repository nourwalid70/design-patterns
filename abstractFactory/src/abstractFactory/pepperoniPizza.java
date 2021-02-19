package abstractFactory;

public class pepperoniPizza extends Pizza{
	
	PizzaIngredientFactory ingredientFactory;
	
    public pepperoniPizza(PizzaIngredientFactory ingredientFactory){ //constructor
		
    	name = "pepperoni pizza ";
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
	System.out.println("Preparing "+ name);
	sauce = ingredientFactory.creatSauce();
	dough = ingredientFactory.creatDough();
	chesse = ingredientFactory.creatChesse();
	pepperoni = ingredientFactory.creatPepperoni();	
	}
}