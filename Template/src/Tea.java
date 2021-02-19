
public class Tea extends template {
	
	boolean b;
	
	Tea(boolean b){
		this.b = b;
	}

	@Override
	protected void addMainComponent() {
	
	System.out.println("adding tea bag");	
	}

	@Override
	protected void addExtraComponent() {
		
	System.out.println("adding lemon");	}
	
	@Override
	boolean wantadafat() {
		return this.b;
		
	}


}
