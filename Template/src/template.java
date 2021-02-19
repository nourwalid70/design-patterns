
public abstract class template {
	
	protected  void boilWater() { // 1
		System.out.println("Boiling Water");
	}
	protected  void PutWater() { // 3 
		System.out.println("Putting Water in cup");
	}
	
	protected abstract void addMainComponent(); // 2
	protected abstract void addExtraComponent(); // 4
	
	void prepare() {
		boilWater();
		addMainComponent();
		PutWater();
		if(wantadafat()) {
		addExtraComponent();}
	}
	
	
	boolean wantadafat() {
		
		return true;
	}

}
