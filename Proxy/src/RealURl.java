import java.util.concurrent.TimeUnit;

public class RealURl implements IURl{

	@Override
	public String GetPage(String url) throws InterruptedException {

		TimeUnit.SECONDS.sleep(2); // wait 2 seconds
		System.out.println("Real !");
		return "<HTML>"+ url + "</HTML>";
	}

}
