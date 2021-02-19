package sherka;
import Builder.Robot;
import Builder.RobotDirector;
import Builder.CubicalRobot;
import Builder.SpharicalRobot;

public class shrka {

	public static void main(String[] args) {
		
    	RobotDirector d1 = new RobotDirector(new SpharicalRobot());
		Robot r1 = d1.getBuild();
		Robot r2 = d1.getBuild();
		Robot r3 = d1.getBuild();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		RobotDirector d2 = new RobotDirector(new CubicalRobot());
		Robot r4 = d2.getBuild();
		Robot r5 = d2.getBuild();
		Robot r6 = d2.getBuild();
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
		
	}

}
