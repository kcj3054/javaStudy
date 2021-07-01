package ex12_Porlimorpism;

//추상 클래스는 추상매소드를 포함해야한다 . 

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
		
		
		//하위 클래스 객체를 상위클래스 객체에 대입
		Calc calc = new MyCalc();
		calc.plus();
		
		//다음 메서드는 설계도에 없다, 사용 할 수 없다.
		//calc.minus();
	}

}
