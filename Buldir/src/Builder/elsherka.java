package Builder;
public class elsherka {

	public static void main(String[] args) {
		
		RobotDirector d = new RobotDirector(new SpharicalRobot());
		Robot r1 = d.getBuild();
		Robot r2 = d.getBuild();
		Robot r3 = d.getBuild();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

}
