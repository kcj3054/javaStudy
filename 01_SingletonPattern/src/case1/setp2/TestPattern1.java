package case1.setp2;

public class TestPattern1 {

	public static void main(String[] args) {
		Database database;
		
		database = Database.getInstance("ù ��° DATABASE");
		System.out.println("This is the " + database.getName());
		
		database = Database.getInstance("�ι�° database");
		System.out.println("This is the " + database.getName());

		//���� ����ڰ� 
		//Database d1 = new Database("1");
		//�̰� �����ϱ����ؼ� �����ͺ��̽� ������ private�� ���ش� 
	}

}
