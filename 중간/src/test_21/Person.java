package test_21;

import java.util.Random;

public class Person {

	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		Random random = new Random();
		
		int a = random.nextInt(3) + 1;
		int b = random.nextInt(3) + 1;
		int c = random.nextInt(3) + 1;
		
		System.out.println("[" + name + "]");
		System.out.print("\t\t" + a + " " + b + " " + c);
		
		if(a == b && b == c) {
			System.out.println("\t " + name + "¥‘¿Ã ¿Ã∞ÂΩ¿¥œ¥Ÿ");
			return 1;
		} else {
			System.out.println("");
			return -1;
		}
	}
}
