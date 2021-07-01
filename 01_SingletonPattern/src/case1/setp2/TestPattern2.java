package case1.setp2;

public class TestPattern2 {
	
	static int nNum = 0;
	
	public static void main(String[] args) {
		
		Runnable task = () -> {
			try {
				nNum++;
				
				Database database = Database.getInstance(nNum + " ��° database ");
				System.out.println("This is the " + database.getName());
			}catch (Exception e) {
				
			}
		};
		
		for(int i = 0; i<10 ; i++) {
			Thread t = new Thread(task);
			t.start();
			//�����带 ����Ѵٸ� singleton������ ������� �������ִ� ������ ��û ������ ���� ���ÿ� �����尡 ��û���ϸ� 
			//singleton�ڵ忡�� �� null�̶���� �� ��ü�� ������ش� 
		}
	}

}
