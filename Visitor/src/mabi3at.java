
public class mabi3at implements IVisitor {

	@Override
	public void visit(car c) {
		
		c.setPrice(c.getPrice()*1.2);
	}

	@Override
	public void visit(chair k) {
		
		k.setPrice(k.getPrice()*1.1);
	}

	@Override
	public void visit(mango m) {
		// TODO Auto-generated method stub
		m.setPrice(m.getPrice()*1.5);
	}

}
