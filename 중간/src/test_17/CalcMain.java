package test_17;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.nextLine();
		String c = sc.nextLine();
		
		Calc calc = null;
		
		if(c.equals("+")) {
			calc = new Add();
		}else if(c.equals("-")) {
			calc = new Sub();
		}else if(c.equals("*")) {
			calc = new Mul();
		}else if(c.equals("/")) {
			calc = new Div();
		}
		
		calc.setValue(a, b);
		System.out.println(calc.calculate());
	}

}
