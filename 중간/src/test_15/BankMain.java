package test_15;

// ����� �Ҽ��ֳ�
// �������̵��� Ȱ���� �� �ֳ�

public class BankMain {

	public static void main(String[] args) {
		
		ABank aBank = new  ABank();
		BBank bBank = new  BBank();
		CBank cBank = new  CBank();
		
		System.out.println("ABank�� ������ : " + aBank.getInterestRate());
		System.out.println("BBank�� ������ : " + bBank.getInterestRate());
		System.out.println("CBank�� ������ : " + cBank.getInterestRate());
		
	}

}
