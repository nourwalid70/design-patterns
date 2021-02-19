package Builder;
public abstract class BuilderRobot {
	
	String type;
	int daman;
	int price;
	String headType;
	String bodyType;
	String legType;
		
                                       // return to super class	
abstract BuilderRobot setType();

abstract BuilderRobot setDaman();

abstract BuilderRobot setprice();

abstract BuilderRobot setHeadType();

abstract BuilderRobot setBodyType();

abstract BuilderRobot setLegType();	
	

/*private void assemble() {
	this.setType()
	.setHeadType()
	.setBodyType()
	.setLegType()
	.setDaman();
}*/

public Robot Build() {
	//assemble();
	return new Robot(type,daman,price,headType,bodyType,legType);
	
}


}
