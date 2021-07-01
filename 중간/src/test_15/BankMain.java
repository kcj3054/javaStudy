package test_15;

// 상속을 할수있냐
// 오버라이딩을 활용할 수 있냐

public class BankMain {

	public static void main(String[] args) {
		
		ABank aBank = new  ABank();
		BBank bBank = new  BBank();
		CBank cBank = new  CBank();
		
		System.out.println("ABank의 이자율 : " + aBank.getInterestRate());
		System.out.println("BBank의 이자율 : " + bBank.getInterestRate());
		System.out.println("CBank의 이자율 : " + cBank.getInterestRate());
		
	}

}
