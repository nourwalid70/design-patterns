import java.util.ArrayList;

public class Sosa implements Isubject {
	
	Crush c1 = new Crush("Nour", false);
	Crush c2 = new Crush("Radwa", false);
	Crush c3 = new Crush("Nada", false);
	ArrayList<Crush> c = new ArrayList<>();
	ArrayList<IObserver> o = new ArrayList<>();
	
	Sosa(){
		this.c.add(c1);
		this.c.add(c2);
		this.c.add(c3);
	}

	@Override
	public void subscribe(IObserver obs) {
		o.add(obs);

	}

	@Override
	public void unsubscribe(IObserver obs) {
		for(int i=0; i<o.size() ; i++) {
			if(o.get(i) == obs) {
				o.remove(i);
			}
		}

	}

	public void HaveNewInfo() { //to lovers send Info >"		
		
		for(int i=0; i<o.size() ; i++) {
			o.get(i).update(this.c);
		}
		
	}

	public void setNewInfo(String name , boolean b) {
		for(int i=0 ; i<c.size() ; i++) {
			if(this.c.get(i).name == name) {
				
				this.c.get(i).single = b;
			}
		}
		
	}
	
}
