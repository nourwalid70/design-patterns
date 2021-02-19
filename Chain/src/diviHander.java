
public class diviHander implements MathHander {

	MathHander next;
	
	@Override
	public void SetNext(MathHander m) {
		this.next = m;
	}

	@Override
	public void Calculate(request r) {
		
		if(r.operator == '/') {
			if(r.y != 0)
				System.out.println(r.x / r.y);
			else
				System.out.println("Invalid!");
		}
		else {
			System.out.println("Cant calculate");
		}

	}


}
