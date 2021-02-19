
public class tester {

	public static void main(String[] args) {
		Ipizza p1 = new Zatton(new Motzarlla(new plainPizza()));
        System.out.println(p1.GetCost());
        System.out.println(p1.GetDescription());
        
        
        //---------------------------------------------------------------//
        
        Ipizza p2 = new  Builderso8nn()
        		         .add_Zatton() 
        		         .add_Motzarlla()
        		         .Build();
      
        System.out.println(p2.GetCost());
        System.out.println(p2.GetDescription());
	}

}
