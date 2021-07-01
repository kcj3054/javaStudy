import java.util.Random;

//인스턴스 생성과 관계 없이 static 변수가 메모리 공간에 할당될때 실행된다
// static은 여러 인스턴스들이  같은 메모리의 값을 공유 해서 사용할때 사용한다 
// 
public class StaticEx2 {

	static int num;
	static int numValue;
	
	//static 초기화목록 
	static {
		Random rand = new Random();
		//main 실행 전에 이미 난수값이 대입이 된다 
		num = rand.nextInt(100);
	}
	
	static {
		Random rand2 = new Random();
		numValue = rand2.nextInt(200);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(num);
		System.out.println(numValue);
	}

}
