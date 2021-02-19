import java.util.ArrayList;

public class shyLovers implements IObserver {
	
	String name;
	Isubject s;
	
	shyLovers(String name , Isubject s ){
		this.name = name;
		this.s = s;
		this.s.subscribe(this);
	}


	@Override
	public void update(ArrayList<Crush> c) {

		System.out.println("I am shy & name is "+ this.name + "\nI got new Info");
		
		for(int i =0; i< c.size() ; i++) {
			System.out.println(c.get(i).name + " " + c.get(i).single);
		}
		System.out.println("********************");
	}

}
