
public abstract class Person {
	
	int age;
	String gender;
	int rate;
	int NumOfRaters;
	double aveRate;
	

	public abstract int getAge() ;

	public abstract void setAge(int age);

	public abstract String getGender() ;
	
	public abstract void setGender(String gender);

	public abstract void Rate(int rate);

	public abstract int getNumOfRaters() ;

	//public abstract void setNumOfRaters(int numOfRaters);

	public abstract double getAveRate();
		
	

}
