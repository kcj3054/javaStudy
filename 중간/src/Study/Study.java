package Study;


class TimerThread extends Thread {
	@Override
	public void run() {
		super.run();
	}
	
	
}
public class Study {

	public static void main(String[] args) {
		
		TimerThread  th = new TimerThread ();
		th.start();

	}

}
