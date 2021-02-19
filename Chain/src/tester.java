
public class tester {

	public static void main(String[] args) {
		
		request r = new request(5,0,'-');
		Receiver rec = new Receiver();
		rec.Send(r);
		
	}

}
