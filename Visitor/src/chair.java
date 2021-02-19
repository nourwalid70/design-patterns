
public class chair implements Visitable {
	
	double price;
	
	chair(double price){
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void accepted(IVisitor v) {
		
		v.visit(this); // visit >> car / chair / mango 
		
	}
}
