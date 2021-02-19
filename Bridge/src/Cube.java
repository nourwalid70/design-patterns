
public class Cube extends Shape {

	

	public Cube(Implementor key) {
		super(key);
	}

	@Override
	public void Get_Shape() {
	
		System.out.println("I am cube and I increase health by " + this.key.Get_Key());
	}

}
