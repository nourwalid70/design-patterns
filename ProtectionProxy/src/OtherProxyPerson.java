
public class OtherProxyPerson extends Person {

	Person p;
	   public OtherProxyPerson(Person p) {
	 	this.p = p;
	}

	@Override
	public int getAge() {
		
		return p.getAge();
	}

	@Override
	public void setAge(int age) {

		System.out.println("INVALID !");

	}

	@Override
	public String getGender() {
		
		return p.getGender();
	}

	@Override
	public void setGender(String gender) {
		
		System.out.println("INVALID !");

	}

	@Override
	public int getNumOfRaters() {
		
		return p.getNumOfRaters();
	}

	/*@Override
	public void setNumOfRaters(int numOfRaters) {

		System.out.println("INVALID !");
		
	}*/

	@Override
	public double getAveRate() {
		
		return p.getAveRate();
	}

	@Override
	public void Rate(int rate) {
		
	this.p.Rate(rate);	
		
	}

}
