package ex_01_class_2;
// Ŭ������ �޼��常 �ִ� ���

class Calc {
	
	int add(int a, int b) {	
		return a+b;
	}
	
}


public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc = new Calc();
		
		int nReturn = calc.add(3, 9);
		
		System.out.println("3 + 9 =" + nReturn);
	}

}
