import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		//int array []; //참조 변수 선언, []는 앞에하거나 뒤에하거나 아무대나 해도된다 ㅇ 
		int [] array = new int[10];
		//array = new int[10];
		
		
		for(int i = 0 ; i< 10 ; i++) {
			array[i] = i;
		}

		
		char a [] = new char[20];
		
		//java에서는 int 정수배열[5]; 안된다.. 에러발생 
		//length 필드를 이용해서 배열 길이 쉽게 확인 할 수 있다
		
		Scanner in = new Scanner(System.in);
		
		int [] array_in = new int[5];
		int sum = 0;
		double average = 0.0;
		
		for(int i = 0 ; i < array_in.length ; i++) {
			System.out.println("정수 입력? ");
			array_in[i] = in.nextInt();
		}
		for( int i = 0 ; i< array_in.length; i++) {
			sum += array_in[i];
		}
		
		average = (double) sum / array_in.length ; 
		System.out.println("합산 " + sum);
		System.out.println("평균 : " + average);
		
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
