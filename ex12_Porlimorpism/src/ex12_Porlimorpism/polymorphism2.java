package ex12_Porlimorpism;

//����ũ�μ���Ʈ�� : ������ 10���� ���� �����ʹ� ������ �԰��� �ؼ��ؾ��մϴ�. printable�� ������ �ּ��� 
//�Ʒ����ѱ�, MS Word : �μ�� Printable�� print�� ȣ���ϸ� �Ǵ±��� �˰ڽ��ϴ� 
// �Ｚ , �ۼ� : �����ʹ� Printable �������̽� �԰ݿ� ���缭  ����ڽ��ϴ� 

interface Printable {
	void print(String doc);
}

class PrnDrvSamsung implements Printable {
	public void print(String doc) {
		System.out.println( doc + "\nFrom Samsung : Black-White Ver");
		
	}
}

class prnDrvEpson implements Printable { 
	public void print(String doc) {
		System.out.println( doc + "\nFrom Epson : Black-White Ver");
	}
}
public class polymorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String doc = "�����ͷ� ����մϴ� ";
		
		Printable prn1 = new PrnDrvSamsung();
		prn1.print(doc);
		
		Printable prn2 = new prnDrvEpson();
		prn2.print(doc);
		
	}

}
