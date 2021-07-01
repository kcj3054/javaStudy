package Iterator_kumoh;

import java.util.Iterator;
import java.util.Vector;

public class Iterator_kumoh {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		v.add(3);
		v.add(7);
		
		
		//Iterator을 이용한 모든 원소 출력 
		Iterator<Integer> it = v.iterator();
		
		int sum = 0;
		

		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
			
			sum += n;
		}
		
		System.out.println("모든 원소의 합 "+sum);
	}

}
