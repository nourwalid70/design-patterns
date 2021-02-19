import java.util.ArrayList;

public class Department extends CompanyComposite {
	
	String name;
	ArrayList<CompanyComposite> arr = new ArrayList<>();
	
	Department(String name){
		this.name = name;
	}

	public void add(CompanyComposite c) {
		this.arr.add(c);
	}
	
	/*public void PrintDepartmentInfo() {
		
		System.out.println(this.name + ", with : { \n");
		
		for (Object object : arr) {  // END conditions USING composite
			if(object instanceof Department) {
				((Department) object).PrintDepartmentInfo();
			}
			else if(object instanceof Employee) {
				((Employee) object).PrintEmployeeInfo();
			}
			
		}
		System.out.println("                   }");	
	}*/

	@Override
	public void PrintInfo() {
		System.out.println(this.name + ", with : { \n");
		
		for (CompanyComposite c : arr) {  // END conditions USING composite
			
			c.PrintInfo();
		}
		System.out.println("                   }");	
		
	}
	
}
