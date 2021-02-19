
public class Employee extends CompanyComposite {

	String name;
	int salary;
	
	Employee(String name , int salary){
		this.name = name;
		this.salary = salary;
	}
	
	/*public void PrintEmployeeInfo() {
		
		System.out.println("Name :: "+ this.name + " , Salary :: "+ this.salary+"\n");
	}*/

	@Override
	public void PrintInfo() {
		
		System.out.println("Name :: "+ this.name + " , Salary :: "+ this.salary+"\n");
	}
}
