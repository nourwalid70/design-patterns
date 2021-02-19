
public abstract class batta {

	private int id;
	private String name;
	private static int counter = 1; // static to not begin from zero
	protected flyable myfly;
	batta(){
		this.id = counter++;
		this.name = "batta>>"+this.id;
	}
	
	public String swim() {
		return "I can swim";
	}
	
	abstract String display(); // fly & quack /* diff */ //
	
	public void perform() {
		System.out.println("My name is"+ this.name);
		System.out.println(this.swim());
		System.out.println(this.display());
		System.out.println(this.myfly.fly());
	}
}
