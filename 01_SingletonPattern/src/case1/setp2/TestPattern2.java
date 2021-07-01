package case1.setp2;

public class TestPattern2 {
	
	static int nNum = 0;
	
	public static void main(String[] args) {
		
		Runnable task = () -> {
			try {
				nNum++;
				
				Database database = Database.getInstance(nNum + " 번째 database ");
				System.out.println("This is the " + database.getName());
			}catch (Exception e) {
				
			}
		};
		
		for(int i = 0; i<10 ; i++) {
			Thread t = new Thread(task);
			t.start();
			//쓰레드를 사용한다면 singleton패턴은 취약점을 가지고있다 포문이 엄청 빠른데 거의 동시에 쓰레드가 요청을하면 
			//singleton코드에서 다 null이라고보고 다 객체를 만들어준다 
		}
	}

}
