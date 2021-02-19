package abstractFactory;

public class cheesePizza extends Pizza{
	
	PizzaIngredientFactory ingredientFactory;
	
    public cheesePizza(PizzaIngredientFactory ingredientFactory){ //constructor
    	
		name = "chesse pizza ";
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
	System.out.println("Preparing "+ name);
	sauce = ingredientFactory.creatSauce();
	dough = ingredientFactory.creatDough();
	chesse = ingredientFactory.creatChesse();	
	}
}