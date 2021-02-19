
public class triangle extends Shape {

	public triangle(Implementor key) {
		super(key);
		
	}

	@Override
	public void Get_Shape() {
		
		System.out.println("I am triangle and I increase speed by " + this.key.Get_Key());
	}

}
