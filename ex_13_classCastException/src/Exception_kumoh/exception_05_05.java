package Exception_kumoh;

import java.util.Scanner;

public class exception_05_05 {

	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�����Է� : ");
		int up = sc.nextInt();
		System.out.println("�и� �Է�: ");
		int down = sc.nextInt();
		
		try {
			System.out.println(up + "/" + down +"="  + up/down);
		}
		catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
		} finally {
			sc.close();
		}
	}

}
