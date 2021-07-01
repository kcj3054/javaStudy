package Exception_kumoh;

import java.util.Scanner;

public class exception_05_05 {

	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);
		
		
		System.out.println("분자입력 : ");
		int up = sc.nextInt();
		System.out.println("분모 입력: ");
		int down = sc.nextInt();
		
		try {
			System.out.println(up + "/" + down +"="  + up/down);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} finally {
			sc.close();
		}
	}

}
