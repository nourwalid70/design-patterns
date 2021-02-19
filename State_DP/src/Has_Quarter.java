
public class Has_Quarter extends state {

	public Has_Quarter(Gumballmachine2 machine) {
		super(machine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert_quarter() {
		System.out.println("you insert one!");
	}

	@Override
	public void ejects_quarter() {
		System.out.println("Fine, take your coin");
		State = No_Quarter;
	}

	@Override
	public void turns() {
		System.out.println("you will have one soon");
		State = Sold;
		dispense(); // to set new action 
	}

	@Override
	public void dispense() {
		System.out.println("Sorry");
	}

}
