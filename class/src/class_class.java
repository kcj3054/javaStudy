import java.io.InputStream;
import java.util.Scanner;

//�����ڴ� �ʵ��� �ʱ�ȭ�� ����Ѵ�.�����ڴ� �������̵��� �����ϴ� 
//�����ڿ��� �� �ٸ� �����ڸ� ȣ���Ҷ� this�޼ҵ带 ����Ѵ� 
//this�޼ҵ�� �ٸ� �ڵ庸�� ���� ����Ǿ���Ѵ� 


//static ���α׷����۰� ���ÿ� lifeCycle�� ���ư��� 
//static�� ���� �ɹ��� ��������Ҷ� ����Ѵ� , static���� �ν��Ͻ����� ������ �Ѵ� (Ŭ������ �ٸ���쿡�� ���ٰ���)
//��� Ŭ���� �Ҽ����� �˷��ְ� Ŭ����.�޼ҵ� �� �����ؼ� ��� �����ϴ�

public class class_class {

	
	//���⼭ static ���� �����Ϸ��� class_class ��ü���� ��ü���� checkEven�Լ��� �����ؾ��Ѵ� 
	static boolean checkEven(int num) {
		return ((num % 2) ==0);
	}
//	String name;
//	int balance;

//	public class_class() {
//		this("��������", 10000);
//	}
//	
//	public class_class(String name, int balance) {
//		this.name = name;
//		this.balance = balance;
//	}
//	
//	public void deposit(int balance) {
//		this.balance += balance;
//	}
//	
//	public void withdraw(int balance) {
//		
//		this.balance -=balance;
//	}
	
	public static void main(String[] args) {
		
//		class_class account = new class_class();
//		
//		account.deposit(1000000);
//		
//		System.out.println(account.name +"�� �ܾ��� " + account.balance);

		int input;
		boolean output;
		Scanner s= new Scanner(System.in);
		input = s.nextInt();
		s.close();
		
		if(checkEven(input)) {
			System.out.println("¦��");
		}else System.out.println("Ȧ�� ");
	}



}
