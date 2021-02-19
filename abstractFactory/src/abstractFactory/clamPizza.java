package abstractFactory;

public class clamPizza  extends Pizza{
	
	PizzaIngredientFactory ingredientFactory;
	
    public clamPizza(PizzaIngredientFactory ingredientFactory){ //constructor
    	
		name = "clame pizza ";
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
	System.out.println("Preparing "+ name);
	sauce = ingredientFactory.creatSauce();
	dough = ingredientFactory.creatDough();
	clam = ingredientFactory.creatCalm();	
	}
}
