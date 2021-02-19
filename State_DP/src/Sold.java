
public class Sold extends state {

	public Sold(Gumballmachine2 machine) {
		super(machine);
	}

	@Override
	public void insert_quarter() {
		System.out.println("you insert one!");
	}

	@Override
	public void ejects_quarter() {
		System.out.println("Sorry");
	}

	@Override
	public void turns() {
		System.out.println("Sorry, you have one!");
	}

	@Override
	public void dispense() {
		 if(num==0) State=OutOfGumball;
	else if(num>0)  State=No_Quarter;
	}

}
