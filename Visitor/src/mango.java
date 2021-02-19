
public class mango implements Visitable{
	
	double price;
	
	mango(double price){
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
