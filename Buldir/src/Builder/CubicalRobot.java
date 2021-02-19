package Builder;
public class CubicalRobot extends BuilderRobot {

	@Override
	BuilderRobot setType() {
		this.type = "cubical";
		return this;
	}

	@Override
	BuilderRobot setDaman() {
		this.daman = 5;
		return this;
	}

	@Override
	BuilderRobot setHeadType() {
		this.headType = "cubical";
		return this;
	}

	@Override
	BuilderRobot setBodyType() {
		this.bodyType = "cubical";
		return this;
	}

	@Override
	BuilderRobot setLegType() {
		this.legType = "cubical";
		return this;
	}

	@Override
	BuilderRobot setprice() {
		this.price = 2000;
		return this;
	}

	
	
}
