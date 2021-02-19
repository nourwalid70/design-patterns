import java.util.concurrent.TimeUnit;

public abstract class tester {

	public static void main(String[] args) throws InterruptedException {
		
		IURl r = new ProxyURl();
		String r1 = r.GetPage("nour");
		System.out.println(r1);
		TimeUnit.SECONDS.sleep(2);
		r1 = r.GetPage("nour");
		System.out.println(r1);
	}

}
