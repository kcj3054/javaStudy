package test_17;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		
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
