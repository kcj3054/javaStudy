package ex12_Porlimorpism;

//�߻� Ŭ������ �߻�żҵ带 �����ؾ��Ѵ� . 

abstract class Calc{
	int a= 5;
	int b= 6;
	
	abstract void plus();
}

class MyCalc extends Calc {
	void plus() {System.out.println( a + b);}
	void minus() {System.out.println(a -b);}
}
public class polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalc mycalc = new MyCalc();
		mycalc.plus();
		mycalc.minus();
		
		
		//���� Ŭ���� ��ü�� ����Ŭ���� ��ü�� ����
		Calc calc = new MyCalc();
		calc.plus();
		
		//���� �޼���� ���赵�� ����, ��� �� �� ����.
		//calc.minus();
	}

}
