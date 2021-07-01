package wildcardTest;

import java.util.Random;
import java.util.Vector;

//상한이 있는 와일드 카드 ? extends Numberd  

public class wildcardTest {

	public static double sumOfVec(Vector<? extends Number>v) {
		
		double s = 0.0;
		for(Number n : v)
			s += n.doubleValue();
		return s;
	}
	public static void main(String[] args) {
		
		Vector<Integer> vn = new Vector<>();
		Random randObj = new Random();
		for(int n = 0; n<10; n++) {
			vn.addElement(randObj.nextInt(100));
		}
		
		Vector<Double> vd = new Vector<>();
		for(int n1 = 0; n1<10; n1++) {
			vd.addElement(randObj.nextDouble() * 100.0);
			
		}
		
		

	}

}
