
public class OwnProxyPerson extends Person {

	Person p;
	   public OwnProxyPerson(Person p) {
	 	this.p = p;
	}

	@Override
	public int getAge() {
		
		return p.getAge();
	}

	@Override
	public void setAge(int age) {
		this.age = age;
		this.p.setAge(age);

	}

	@Override
	public String getGender() {
		
		return p.getGender();
	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
		this.p.setGender(gender);

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
		
		System.out.println("INVALID !");
	}


}
