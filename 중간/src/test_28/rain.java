package test_28;

import java.util.Scanner;
import java.util.Vector;

public class rain {

	public static void main(String[] args) {

		Vector<Integer> Stack = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է�(0�Է½� ����)");
			int num = sc.nextInt();
			if(num ==0)break;
			Stack.add(num);
			
			int avr = 0;
			for(int i =0; i<Stack.size() ; i++) {
				System.out.print(Stack.get(i)+" ");
				avr += Stack.get(i);
			}
			System.out.println();
			avr /= Stack.size();
			System.out.println("������� "+avr);
		}
		
		sc.close();
	}

}
