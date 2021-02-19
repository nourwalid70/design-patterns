import java.util.HashMap;
import java.util.Map;

public class ProxyURl implements IURl{
	
	IURl real = new RealURl();
	Map<String,String> URLtoPage = new HashMap<String,String>();
	Map<String,Integer> URLtoTime = new HashMap<String,Integer>();

	@Override
	public String GetPage(String url) throws InterruptedException {
		if(URLtoTime.containsKey(url)) {  // boolean
			
			int lastTime = URLtoTime.get(url);
			
			if(((int)System.currentTimeMillis()-lastTime) < 5000 ) { // System.currentTimeMillis >> long int
				
				System.out.println("proxy !");
				return URLtoPage.get(url);
			}
			else {
				String page = this.real.GetPage(url);
				URLtoPage.put(url, page);
				URLtoTime.put(url, (int) System.currentTimeMillis());
				return page;
			}
			
		}
	else {
			String page = this.real.GetPage(url);
			URLtoPage.put(url, page);
			URLtoTime.put(url, (int) System.currentTimeMillis());
			return page;
		}
	}
  
	
	
}
