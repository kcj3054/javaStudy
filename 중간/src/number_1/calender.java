package number_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class calender {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�˰� ���� ���� �Է��Ͻÿ� : ");
		
		int day = 0;
		
		int month = sc.nextInt();
		
		switch(month) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day  = 28;
			break;
		case 4 : case 6: case 9: case11:
			day = 30;
			break;
			
			default :
				System.out.println("1~12���� ���ڸ� �Է��ϼ���");
				System.exit(0);				
			
		}
		System.out.println("���� ������ " + day);
		
		
		

	}

}
