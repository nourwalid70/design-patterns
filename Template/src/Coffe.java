
public class Coffe extends template {

boolean b;
	
	Coffe(boolean b){
		this.b = b;
	}

	@Override
	protected void addMainComponent() {
	
	System.out.println("adding Coffe");	
	}

	@Override
	protected void addExtraComponent() {
		
	System.out.println("adding Milk & Suger");	}
	
	@Override
	boolean wantadafat() {
		return this.b;
		
	}


}
