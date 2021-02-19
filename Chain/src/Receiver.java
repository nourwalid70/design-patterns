
public class Receiver {
	
	
	MathHander add = new addHander();
	MathHander sub = new subHander();
	MathHander mul = new mulHander();
	MathHander div = new diviHander();
	
	public Receiver() { // create chain
		super();
		add.SetNext(sub);
		sub.SetNext(mul);
		mul.SetNext(div);
		}
	
	public void Send(request r) { // head of chain
		add.Calculate(r);
	}

}
