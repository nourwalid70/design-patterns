package abstractFactory;

public interface PizzaIngredientFactory {
	
	public Dough creatDough();
	public Sauce creatSauce();
	public Chesse creatChesse();
	public Pepperoni creatPepperoni();
	public Clam creatCalm();

}
