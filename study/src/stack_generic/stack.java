package stack_generic;

import java.util.Scanner;

public class stack {

	public static void main(String[] args) {
		System.out.print("����>>");
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
				System.out.print("0���� ���� �� �����ϴ�.");
				s.close();
				return;
			} else
				res = op1 / op2;
		} else {
			System.out.print("��Ģ������ �ƴմϴ�.");
			s.close();
			return;
		}
		System.out.println("����� " + res);
		s.close();
	}
}
