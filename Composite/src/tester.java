
public abstract class tester {

	public static void main(String[] args) {
		
		/*Employee e1 = new Employee("A", 100);
		Employee e2 = new Employee("B", 200);
		Employee e3 = new Employee("C", 300);
		Employee e4 = new Employee("D", 400);
		Employee e5 = new Employee("E", 500);

		Department d1 = new Department("CSE");
		Department d2 = new Department("Electrical");
		Department d3 = new Department("Mechanical");
		
		d1.add(e1);
		d1.add(e2);
		d1.add(d2);
		d2.add(e3);
		d2.add(e4);
		d2.add(d3);
		d3.add(e5);
		d1.PrintDepartmentInfo();*/
		
		CompanyComposite e1 = new Employee("A", 100);
		CompanyComposite e2 = new Employee("B", 200);
		CompanyComposite e3 = new Employee("C", 300);
		CompanyComposite e4 = new Employee("D", 400);
		CompanyComposite e5 = new Employee("E", 500);

		CompanyComposite d1 = new Department("CSE");
		CompanyComposite d2 = new Department("Electrical");
		CompanyComposite d3 = new Department("Mechanical");
		
		d1.add(e1);
		d1.add(e2);
		d1.add(d2);
		d2.add(e3);
		d2.add(e4);
		d2.add(d3);
		d3.add(e5);
		//e2.add(e5); 
		d1.PrintInfo();
		
	}

}
