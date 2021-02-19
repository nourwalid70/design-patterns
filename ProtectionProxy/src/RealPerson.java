
public class RealPerson extends Person {

	RealPerson(int age,String gender){
		
		this.age = age;
		this.gender = gender;
		this.rate = 0;
		this.NumOfRaters = 0;
		this.aveRate = 0.0;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNumOfRaters() {
		return NumOfRaters;
	}

	public void setNumOfRaters(int numOfRaters) {
		NumOfRaters = numOfRaters;
	}

	public double getAveRate() {
		return aveRate;
	}

	public void setAveRate(double aveRate) {
		this.aveRate = aveRate;
	}

	@Override
	public void Rate(int rate) {
		this.setAveRate((this.getAveRate()*NumOfRaters + rate)/(this.NumOfRaters+1.0));
		this.NumOfRaters++;
	}
	
}
