
public abstract class state {
	
	Gumballmachine2 m = new Gumballmachine2();
	
	public state(Gumballmachine2 machine) {
		this.m  =machine;
	}
	
	  public abstract void insert_quarter();
	  public abstract void ejects_quarter();
	  public abstract void turns();
	  public abstract void dispense();
}
