
public abstract class tester {

	public static void main(String[] args) {
		
		car c = new car(1000);
		chair k = new chair(100);
		mango m = new mango(20);
		
		IVisitor v1 = new gamarik();
		IVisitor v2 = new mabi3at();
		
		System.out.println(c.getPrice());
		v1.visit(c);
		System.out.println(c.getPrice());
		v2.visit(c);
		System.out.println(c.getPrice());
		
		System.out.println("-------------");
		
		System.out.println(m.getPrice());
		v1.visit(m);
		System.out.println(m.getPrice());
		v2.visit(m);
		System.out.println(m.getPrice());
		
		System.out.println("-------------");
		
		System.out.println(k.getPrice());
		v1.visit(k);
		System.out.println(k.getPrice());
		v2.visit(k);
		System.out.println(k.getPrice());
	}

}
