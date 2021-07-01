package ex12_Porlimorpism;

//마이크로소프트사 : 윈도우 10에서 사용될 프린터는 다음의 규격을 준수해야합니다. printable을 구현해 주세요 
//아래아한글, MS Word : 인쇄는 Printable의 print만 호출하면 되는군요 알겠습니다 
// 삼성 , 앱손 : 프린터는 Printable 인터페이스 규격에 맞춰서  만들겠습니다 

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

		String doc = "프린터로 출력합니다 ";
		
		Printable prn1 = new PrnDrvSamsung();
		prn1.print(doc);
		
		Printable prn2 = new prnDrvEpson();
		prn2.print(doc);
		
	}

}
