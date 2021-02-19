
public class Builderso8nn {
	
	Ipizza b = new plainPizza();
	
	Builderso8nn add_Motzarlla() {
		
		this.b = new Motzarlla(this.b);
		return this;
		
	}
	
     Builderso8nn add_Zatton() {
		
		this.b = new Zatton(this.b);
		return this;
		
	}

  Ipizza Build() {
	
	Ipizza finalPizza = this.b;
	this.b = new plainPizza(); // return to first step
	return finalPizza;
	
}

}
