package generic_random;

import java.util.Random;

public class random {

	
	public static <T extends Number> void sumOfNum(T Value, int size) {
	
		double sum = 0.0;
		double average = 0.0;
		
		
		for(int i = 0; i<size; i++) {
			System.out.print(Value+" ");
			sum += Double.parseDouble(Value+"");
		}
		average = sum / size;
		System.out.println();
		System.out.println("합계" +sum);
		System.out.println("평균" +average);
			
	}
	
	public static void main(String[] args) {


		double rand_num =  Math.random();
		
		//Random rand = new Random(); rand는 객체이니 연산 할 수 없다 
		
		int intValue = (int)(rand_num * 100) + 1;
		double dobuleValue = (rand_num * 5);
		
		
		System.out.println("elements in Integer Vector");
		random.sumOfNum(intValue, 10);

		System.out.println("elements in Double Vector");
		random.sumOfNum(dobuleValue, 5);
		
		
		
		
		
	}

}
