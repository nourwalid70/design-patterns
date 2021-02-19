
public class Robot {
	
	Mediator MyMediator;

 	public Robot(Mediator myMediator) {
	super();
	MyMediator = myMediator;
 									}
 	
 	public void Transport() {
 		System.out.println("Robot transporting");
 		MyMediator.Ring();
 		MyMediator.Open();
 	}
 	
}
