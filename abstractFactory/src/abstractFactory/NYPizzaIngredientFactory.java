package abstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough creatDough() {
		// TODO Auto-generated method stub
		return new ThinDough(); // it's a class 
	}

	@Override
	public Sauce creatSauce() {
		// TODO Auto-generated method stub
		return new RedSauce();
	}

	@Override
	public Chesse creatChesse() {
		// TODO Auto-generated method stub
		return new ReggianChesse();
	}

	@Override
	public Pepperoni creatPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clam creatCalm() {
		// TODO Auto-generated method stub
		return new FreshClam();
	}

}
