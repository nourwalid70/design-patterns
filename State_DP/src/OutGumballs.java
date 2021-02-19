
public class OutGumballs extends state {

	public OutGumballs(Gumballmachine2 machine) {
		super(machine);
	}

	@Override
	public void insert_quarter() {
		System.out.println("Out Of qumballs");
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
