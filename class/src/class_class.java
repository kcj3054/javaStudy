import java.io.InputStream;
import java.util.Scanner;

//생성자는 필드의 초기화를 담당한다.생성자는 오버라이딩이 가능하다 
//생성자에서 또 다른 생성자를 호출할때 this메소드를 사용한다 
//this메소드는 다른 코드보다 먼저 수행되어야한다 


//static 프로그램시작과 동시에 lifeCycle이 돌아간다 
//static은 공유 맴버를 만들고자할때 사용한다 , static들은 인스턴스들이 공유를 한다 (클래스가 다른경우에서 접근가능)
//어느 클래스 소속인지 알려주고 클래스.메소드 로 접근해서 사용 가능하다

public class class_class {

	
	//여기서 static 없이 실행하려면 class_class 객체만들어서 객체에서 checkEven함수로 접근해야한다 
	static boolean checkEven(int num) {
		return ((num % 2) ==0);
	}
//	String name;
//	int balance;

//	public class_class() {
//		this("설정없음", 10000);
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
//		System.out.println(account.name +"의 잔액은 " + account.balance);

		int input;
		boolean output;
		Scanner s= new Scanner(System.in);
		input = s.nextInt();
		s.close();
		
		if(checkEven(input)) {
			System.out.println("짝수");
		}else System.out.println("홀수 ");
	}



}
