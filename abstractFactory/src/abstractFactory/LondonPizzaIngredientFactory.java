package abstractFactory;

public class LondonPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough creatDough() {
		// TODO Auto-generated method stub
		return new ThickDough();
	}

	@Override
	public Sauce creatSauce() {
		// TODO Auto-generated method stub
		return new WhiteSauce();
	}

	@Override
	public Chesse creatChesse() {
		// TODO Auto-generated method stub
		return new MotzzarellaChesse();
	}

	@Override
	public Pepperoni creatPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}


	@Override
	public Clam creatCalm() {
		// TODO Auto-generated method stub
		return new FrozenClam();
	}

}
