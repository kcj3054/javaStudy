package number_2;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1~99 ������ ������ �Է��Ͻÿ� :");
		
		int n = input.nextInt();
		
		if(n < 10) {
			if (n == 3 || n == 6 || n == 9)
				System.out.println("�ڼ�¦");
			else
				System.out.println("�ڼ�����");
		}
		
		//���ڸ� �� �ΰ�� 
		
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
				System.out.println("�ڼ�¦¦");
			else if(b1 || b2)
				System.out.println("�ڼ�¦");
			else
				System.out.println("�ڼ�����");
		}
		
		input.close();
	}

}
