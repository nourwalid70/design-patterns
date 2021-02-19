
public class Gumballmachine2 {
	// States
		private state No_Quarter;
		private state Has_Quarter;
		private state Sold;
		private state OutOfGumball;
		//*****************************
		private int num;
		private state State = No_Quarter ;
		
		public  Gumballmachine2(int n) {
			this.num = n;
			// also create the state instances, one of each
			No_Quarter = new No_Quarter(this);
			Has_Quarter = new Has_Quarter(this);
			Sold = new Sold(this);
			OutOfGumball = new OutGumballs(this);
										}
		
		public void insert_quarter() {
			
			State.insert_quarter();
									 }
		
	    public void ejects_quarter() {
			
	    	State.ejects_quarter();
	    							 }
	    
	    public void turns()          {
			
	    	State.turns();
	    							}
	    
	    public void dispense()      {
			
	    	State.dispense();
	    							}

}