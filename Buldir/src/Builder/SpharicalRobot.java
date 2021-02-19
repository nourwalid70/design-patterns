package Builder;
public class SpharicalRobot extends BuilderRobot {

	@Override
	BuilderRobot setType() {
		this.type = "spharical";
		return this;
	}

	@Override
	BuilderRobot setDaman() {
		this.daman = 10;
		return this;
	}

	@Override
	BuilderRobot setHeadType() {
		this.headType = "spharical";
		return this;
	}

	@Override
	BuilderRobot setBodyType() {
		this.bodyType = "spharical";
		return this;
	}

	@Override
	BuilderRobot setLegType() {
		this.legType = "spharical";
		return this;
	}

	@Override
	BuilderRobot setprice() {
		this.price = 6000;
		return this;
	}

	
}
