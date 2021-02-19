
public class sphare extends Shape {

	public sphare(Implementor key) {
		super(key);
		
	}

	@Override
	public void Get_Shape() {
		System.out.println("I am sphare and I increase power by " + this.key.Get_Key());
	}

}
