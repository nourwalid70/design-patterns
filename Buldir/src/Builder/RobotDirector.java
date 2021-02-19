package Builder;
public class RobotDirector {
	BuilderRobot b;
	
	public RobotDirector(BuilderRobot b){
		this.b = b;
	}
	
  public Robot getBuild() {
	   b.setType()
		.setHeadType()
		.setBodyType()
		.setLegType()
		.setDaman()
		.setprice();
	return b.Build();
  }
	
	
	
}
