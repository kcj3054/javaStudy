package stack_generic;

import java.util.Scanner;

public class stack {

	public static void main(String[] args) {
		System.out.print("계산식>>");
		Scanner s = new Scanner(System.in);
		double op1 = s.nextDouble();
		String op = s.next();
		double op2 = s.nextDouble();
		double res = 0;
		if (op.equals("+"))
			res = op1 + op2;
		else if (op.equals("-"))
			res = op1 - op2;
		else if (op.equals("*"))
			res = op1 * op2;
		else if (op.equals("/")) {
			if (op2 == 0) {
				System.out.print("0으로 나눌 수 없습니다.");
				s.close();
				return;
			} else
				res = op1 / op2;
		} else {
			System.out.print("사칙연산이 아닙니다.");
			s.close();
			return;
		}
		System.out.println("계산결과 " + res);
		s.close();
	}
}
