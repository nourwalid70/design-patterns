
public class Alarm {
	
 Mediator MyMediator;

 	public Alarm(Mediator myMediator) {
	super();
	MyMediator = myMediator;
 									}
 
 	public void Snooze() {
 		int day = MyMediator.GetTime();
 		if(day != 7 || day != 0) {
 			MyMediator.Start();
 		}
 	} 
 	
 	public void Ring() {
 		System.out.println("Ringing !!");
 	}
}
