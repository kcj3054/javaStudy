package test_08;

public class ExceptionTest {

	public static void main(String[] args) {

		//���� ���� ���ڿ��� ���ڷ� ? x 
		try {
		int num = Integer.parseInt("ABC");
		System.out.println(num);
		}catch (NumberFormatException e) {
			System.out.println("���� �����Դϴ�");
		}catch(Exception e) {
			
		}
	}

}
