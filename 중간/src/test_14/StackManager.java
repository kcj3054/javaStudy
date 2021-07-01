package test_14;


import java.util.Scanner;

interface StackInterface { 

	   int length(); 

	   String pop(); 

	   boolean push(String ob); 

	} 

	// StackInterface를 상속받는 StringStack 클래스 정의 

	class StringStack implements StackInterface { 

	   String stack[]; 

	   private int top = 0; 

	   public StringStack() { 

	      stack = new String[3]; 

	   } 

	   @Override 

	   public int length() { 

	      return top + 1; 

	   } 

	   @Override 

	   public String pop() { 

	      return stack[--top]; 

	   } 

	   @Override 

	   public boolean push(String ob) { 

	      if (top == 5) return false; 

	      else stack[top++] = ob; 

	      return true; 

	   } 

	} 

	class StackManager { 

	   public static void main(String[] args) { 

	      StringStack stack = new StringStack(); 

	      Scanner sc = new Scanner(System.in); 
	      
	      System.out.print("총 스택 저장 공간의 크기 입력>>");
	      
	      int intput = sc.nextInt();

	      for (int loop = 0; loop < intput; loop++) { 

	         System.out.print("문자열 입력>>"); 

	         String inputStr = sc.next(); 

	         stack.push(inputStr); 

	      } 

	      int num = intput;
	      if(num == intput) {
	    	  System.out.println("스택이 꽉차서 푸시 불가 ");
	      for (int loop = 0; loop < intput; loop++) { 

	         System.out.println(stack.pop()); 

	      } 
	      }

	   } 

	} 



	