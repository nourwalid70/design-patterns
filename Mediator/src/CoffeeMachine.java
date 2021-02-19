
public class CoffeeMachine {
	
	Mediator MyMediator;

 	public CoffeeMachine(Mediator myMediator) {
	super();
	MyMediator = myMediator;
 									}
 	

	public void Start() {
		int day = MyMediator.GetTime();
 		if(day == 5) {
 			System.out.println("preparing coffee with suger");
 		}
 		else {
 			System.out.println("preparing black coffee");
 		}
		System.out.println("finished preparing coffee");
		MyMediator.Transport();
	}
 	
}
