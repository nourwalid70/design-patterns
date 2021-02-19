
public class Mediator {
	
	Alarm a;
	CoffeeMachine cm;
	Robot r;
	MyCalendar c;
	SmartWindow sw;
	
	public void SetObjects(Alarm a,CoffeeMachine cm,Robot r,MyCalendar c,SmartWindow sw) {
		this.a = a;
		this.c = c;
		this.cm = cm;
		this.r = r;
		this.sw = sw;
	}

	public int GetTime() {
		return c.GetTime();
	}

	public void Start() {
		cm.Start();
	}

	public  void Open() {
		sw.Open();
	}

	public void Ring() {
		a.Ring();
		
	}

	public void Transport() {
		r.Transport();
	}
	
	

}
