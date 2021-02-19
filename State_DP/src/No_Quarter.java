
public class No_Quarter extends state {


	public No_Quarter(Gumballmachine2 machine) {
		super(machine);
	}

	@Override
	public void insert_quarter() {
		System.out.println("ok , we take your quarter");
		State = Has_Quarter;
	}

	@Override
	public void ejects_quarter() {
		System.out.println("are you kidding me!");
	}

	@Override
	public void turns() {
		System.out.println("Sorry");
	}

	@Override
	public void dispense() {
		System.out.println("Sorry");
	}

}
