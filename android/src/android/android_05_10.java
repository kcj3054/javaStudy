package android;

public class android_05_10 {


	public static void main(String[] args) {

		
		new Threead(new Runnable()) {
			@override 
			public void run() {
				for (int i = 0; i < 10000; i++) {
				
					num++;
					System.out.println(num);
				}
			}
		}
	}

}
