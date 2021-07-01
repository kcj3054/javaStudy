
//오버로딩 
class Calc {
	int add(int a, int b)
	{
		return a+b;
	}
	
	double add (double a, double b) {
		return a+b;
	}
	
}
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc = new Calc();
		
		int nReturn1 = calc.add(3, 9);
		double nReturn2 = calc.add(3.0, 9.0);
		
		System.out.println( "Return1" +  " " +nReturn1);
		System.out.println( "Return2" +  " " +nReturn2);
	}

}
