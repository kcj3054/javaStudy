package test_09;

import java.util.Iterator;
import java.util.Scanner;

public class Phone {

	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("�ο���>>");
	      int input = sc.nextInt();
	      
	      Phone[] Array = new Phone[input];
	      
	      int cnt = 0;
	      
	      for(int i =0; i<input ; i++) {
	         System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�) >> ");
	         Array[i] = new Phone(sc.next(), sc.next());
	      }
	      System.out.println("����Ǿ����ϴ�...");
	   
	   label : while(true) {
	         System.out.print("�˻��� �̸�  >> ");
	         String serchName = sc.next();
	            
	         for(int i = 0; i < input; i++) {
	            if(serchName.equals("�׸�")) {
	               break label;
	            }
	            else if(serchName.equals(Array[i].getName())) {
	               System.out.println(Array[i].getName() + "�� ��ȣ�� " + Array[i].getTel() + " �Դϴ�.");
	            }
	            else if(!serchName.equals(Array[i].getName()) && i == (input-1)) {
	               System.out.println(serchName + "��(��) �����ϴ�.");
	            }
	         }
	      }
	}
}

