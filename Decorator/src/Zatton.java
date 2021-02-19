
public class Zatton extends Top{

	Zatton(Ipizza temp) {
		super(temp); // To complete
	}

	@Override
	public String GetDescription() {
		
		return temp.GetDescription()+" , Zatton";
	}

	@Override
	public double GetCost() {
		
		return temp.GetCost()+5.0;
	}
}
