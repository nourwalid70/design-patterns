
public class subHander implements MathHander {

	MathHander next;
	
	@Override
	public void SetNext(MathHander m) {
		this.next = m;
	}

	@Override
	public void Calculate(request r) {
		
		if(r.operator == '-') {
			System.out.println(r.x - r.y);
		}
		else {
			this.next.Calculate(r);
		}

	}

}
