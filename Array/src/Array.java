import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		//int array []; //���� ���� ����, []�� �տ��ϰų� �ڿ��ϰų� �ƹ��볪 �ص��ȴ� �� 
		int [] array = new int[10];
		//array = new int[10];
		
		
		for(int i = 0 ; i< 10 ; i++) {
			array[i] = i;
		}

		
		char a [] = new char[20];
		
		//java������ int �����迭[5]; �ȵȴ�.. �����߻� 
		//length �ʵ带 �̿��ؼ� �迭 ���� ���� Ȯ�� �� �� �ִ�
		
		Scanner in = new Scanner(System.in);
		
		int [] array_in = new int[5];
		int sum = 0;
		double average = 0.0;
		
		for(int i = 0 ; i < array_in.length ; i++) {
			System.out.println("���� �Է�? ");
			array_in[i] = in.nextInt();
		}
		for( int i = 0 ; i< array_in.length; i++) {
			sum += array_in[i];
		}
		
		average = (double) sum / array_in.length ; 
		System.out.println("�ջ� " + sum);
		System.out.println("��� : " + average);
		
		System.out.println("============================================");
		
		char [] alpha = new char[26];
		char ch  = 'A';
		
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = ch++;
		}
		for (int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]);
		}
		
	}

}
