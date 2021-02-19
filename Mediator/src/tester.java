
public class tester {

	public static void main(String[] args) {
		
		Mediator m = new Mediator();
		MyCalendar c = new MyCalendar();
		Alarm a = new Alarm(m);
		CoffeeMachine cm = new CoffeeMachine(m);
		Robot r = new Robot(m);
		SmartWindow sw = new SmartWindow();
		m.SetObjects(a, cm, r, c, sw);
		a.Snooze();
	}

}
