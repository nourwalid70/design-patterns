
public class Gumballmachine {
    // States
	private int No_Quarter = 0;
	private int Has_Quarter = 1;
	private int Sold = 2;
	private int OutOfGumball = 3;
	//*****************************
	private int num;
	private int State;
	
	public Gumballmachine(int num) {
		this.num = num;
		State = No_Quarter;
	}
	
	/* State transitions
	**insert_quarter
	**ejects_quarter
	**turns
	**dispense
	*/
	
	public void insert_quarter() {
		
		if(State == No_Quarter) {
			
			System.out.println("ok , we take your quarter");
			State = Has_Quarter;
			
		}else if(State == Has_Quarter) {
			
			System.out.println("you insert one!");
			
		}else if(State == Sold) {
			
			System.out.println("you insert one!");
			
		}else if(State == OutOfGumball) {
			System.out.println("Out Of qumballs");
		}	
	}
	
    public void ejects_quarter() {
		
    	if(State == No_Quarter) {
    		
    		System.out.println("are you kidding me!");
			
		}else if(State == Has_Quarter) {
			
			System.out.println("Fine, take your coin");
			State = No_Quarter;
			
		}else if(State == Sold) {
			
			System.out.println("Sorry");
			
		}else if(State == OutOfGumball) {
			
			System.out.println("are you kidding me!");
		}
	}
    
    public void turns() {
		
    	if(State == No_Quarter) {
    		
    		System.out.println("Sorry");	
			
		}else if(State == Has_Quarter) {
			
			System.out.println("you will have one soon");
			State = Sold;
			dispense(); // to set new action 
			
		}else if(State == Sold) {
			
			System.out.println("Sorry, you have one!");
			
		}else if(State == OutOfGumball) {
			
			System.out.println("Sorry");
		}	
   	}
    
    public void dispense() {
		
    	if(State == No_Quarter) {
			
    		System.out.println("Sorry");
    		
		}else if(State == Has_Quarter) {
			
			System.out.println("Sorry");
			
		}else if(State == Sold) {
			
			     if(num==0) State=OutOfGumball;
			else if(num>0)  State=No_Quarter;
			
		}else if(State == OutOfGumball) {
			
			System.out.println("Sorry");
			
		}
   	}
}
