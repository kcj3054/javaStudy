package number_2;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하시오 :");
		
		int n = input.nextInt();
		
		if(n < 10) {
			if (n == 3 || n == 6 || n == 9)
				System.out.println("박수짝");
			else
				System.out.println("박수없음");
		}
		
		//두자리 수 인경우 
		
		else {
			boolean b1 = false;
			boolean b2 = false; 
			
			int n1 = n / 10;
			int n2 = n % 10;
			
			if(n1 == 3 || n1 == 6 || n1 == 9)
				b1 = true;
			
			if(n2 == 3  || n2 == 6 || n2 == 9)
				b2 = true;
			
			if(b1 && b2)
				System.out.println("박수짝짝");
			else if(b1 || b2)
				System.out.println("박수짝");
			else
				System.out.println("박수없음");
		}
		
		input.close();
	}

}
