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
	      
	      System.out.print("인원수>>");
	      int input = sc.nextInt();
	      
	      Phone[] Array = new Phone[input];
	      
	      int cnt = 0;
	      
	      for(int i =0; i<input ; i++) {
	         System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
	         Array[i] = new Phone(sc.next(), sc.next());
	      }
	      System.out.println("저장되었습니다...");
	   
	   label : while(true) {
	         System.out.print("검색할 이름  >> ");
	         String serchName = sc.next();
	            
	         for(int i = 0; i < input; i++) {
	            if(serchName.equals("그만")) {
	               break label;
	            }
	            else if(serchName.equals(Array[i].getName())) {
	               System.out.println(Array[i].getName() + "의 번호는 " + Array[i].getTel() + " 입니다.");
	            }
	            else if(!serchName.equals(Array[i].getName()) && i == (input-1)) {
	               System.out.println(serchName + "이(가) 없습니다.");
	            }
	         }
	      }
	}
}

