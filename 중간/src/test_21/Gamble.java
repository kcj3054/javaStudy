package test_21;

import java.util.Scanner;

public class Gamble {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1��° ���� �̸�>>");
		String ssc1 = sc.nextLine();
		
		System.out.print("2��° ���� �̸�>>");
		String ssc2 = sc.nextLine();
		
		Person person1 = new Person(ssc1);
		Person person2 = new Person(ssc2);
		
		sc.nextLine();

		while(true) {
			if(person1.getNumber() == 1) {
				break;
			}
			
			sc.nextLine();
			
			if(person2.getNumber() == 1) {
				break;
			}
			
			sc.nextLine();
		}
		
		sc.close();
	}

}
