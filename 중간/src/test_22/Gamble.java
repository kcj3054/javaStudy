package test_22;

import java.util.ArrayList;
import java.util.Scanner;

import test_21.Person;

public class Gamble {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> persons = new ArrayList<>();
		
		int num = 0;
		
		System.out.println("겜블링 게임에 참여할 선수 숫자 >> ");
		
		num = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < num; i++) {
			System.out.print((i+1) + "번째 선수 이름>>");
			String ssc = sc.nextLine();
			
			Person person = new Person(ssc);
			persons.add(person);
		}

		
		sc.nextLine();

		boolean flag = true;
		
		while(flag) {

			for(int i=0; i < num; i++) {
				
				if(persons.get(i).getNumber() == 1) {
					flag = false;
				}else if(flag == true){
					sc.nextLine();
				}
				
			}
		}
		
		sc.close();
	}
}