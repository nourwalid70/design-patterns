
public class Motzarlla extends Top{

	Motzarlla(Ipizza temp) {
		super(temp); // To complete
	}

	@Override
	public String GetDescription() {
		
		return temp.GetDescription()+" , Motzarlla";
	}

	@Override
	public double GetCost() {
		
		return temp.GetCost()+1.0;
	}

}
