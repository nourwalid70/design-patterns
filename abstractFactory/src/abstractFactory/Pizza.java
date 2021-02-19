package abstractFactory;

abstract class Pizza {
String name;
Sauce sauce;
Dough dough;
Chesse chesse;
Pepperoni pepperoni;
 Clam clam;

// name / prepare / bake / cut / box
 
 abstract void prepare();

public String get_name() {
	return name;
}
public void bake() {
	System.out.println("bake " + name + " at 30 min");
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
	
	if(sauce != null) {
	display.append(sauce.ToString());
	display.append("\n");
	}
	
	if(dough != null) {
	display.append(dough.ToString()+"\n");}
	
	if(chesse != null) {
		display.append(chesse.ToString()+"\n");}
	
	if(pepperoni != null) {
		display.append(pepperoni+"\n");}
	
	if(clam != null) {
		display.append(clam.ToString()+"\n");}
	
	return display.toString();
  }

}

