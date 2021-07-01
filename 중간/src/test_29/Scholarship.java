package test_29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Scholarship {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private HashMap<String, Double> scoreMap = new HashMap<>();
	
//	
//	public Scholarship(String name) {
//		this.title = name;
//	}
	
	public void read() {
		System.out.println("���� �����ý����Դϴ�");
		for(int i=0; i< 5 ; i++) {
			System.out.print("�̸��� ����>> ");
			String name = sc.next();
			double score = sc.nextDouble();
			scoreMap.put(name, score);
		}
	}
	
	public void select() {
		System.out.print("���л� ���� ���� ���� �Է�>> ");
		
		double cutline = sc.nextDouble();
		
		System.out.print("���л� ��� : ");
		java.util.Set<String> nameSet = scoreMap.keySet();
		Iterator<String> it = nameSet.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			double score = scoreMap.get(name);
			if(score > cutline)
				System.out.print(name + " ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {

		Scholarship s = new Scholarship();
		s.read();
		s.select();
	}

}
