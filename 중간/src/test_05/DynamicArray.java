package test_05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DynamicArray {

	
	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>();
		
		Random random_num  = new Random();
		
		//int random = (int)random_num; 객체니안된다 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 몇개?");
		int int_num = sc.nextInt();
		
		for(int i = 0; i<int_num ; i++) {
			array.add(random_num.nextInt(100) +1);
		}
		
		for(int i = 0; i<int_num ; i++) {
			System.out.println(array.get(i));
		}
		
		
	}

}
