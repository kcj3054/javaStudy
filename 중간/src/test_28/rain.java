package test_28;

import java.util.Scanner;
import java.util.Vector;

public class rain {

	public static void main(String[] args) {

		Vector<Integer> Stack = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력(0입력시 종료)");
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
			System.out.println("현재평균 "+avr);
		}
		
		sc.close();
	}

}
