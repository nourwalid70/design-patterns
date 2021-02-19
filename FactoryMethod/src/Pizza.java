import java.util.ArrayList;

abstract class Pizza {
String name;
String sauce;
String dough;
ArrayList<String> toppings = new ArrayList<String>(); 

// name / prepare / bake / cut / box

public String get_name() {
	return name;
}

public void prepare() {
	System.out.println("preparing " + name);
}

public void bake() {
	System.out.println("baking " + name);
}
public void cut() {
	System.out.println("cutting " + name);
}

public void box() {
	System.out.println("Boxing " + name);
}

public String ToString() {
	StringBuffer display = new StringBuffer();
	display.append("*****"+name+"*****\n");
	display.append(sauce+"\n");
	display.append(dough+"\n");
	
	for(String t : toppings) {
		display.append(t+"\n"); /////////////////////****************////////////////////
	}
	
	return display.toString();
  }

}
