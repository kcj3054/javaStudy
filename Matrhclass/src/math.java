import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		
		//abs(), ceil(), min, max, round, 삼각함수.. 각도변환.. 지수 로그함수 
		//모든 메소드는 정적메소드 형태로 존재 
		
		//math.random() 메소드는 0이상 1미만 난수 발생 
		//1월에서 `12월 사이의 달 생성은 
		//int(Math.random() * 12 +1)  12를곱하면 0이상 12미만 +1하면 1이상 12이하 

		//java.util.random 클래스 사용 가능 
		//nextInt() 지정된 범위 내의 int 반환 
		//int nextInt(int bound)  0에서 bound범위의 int 반환 
		
		//void setSeed(long seed) seed값 설정 , 랜덤의 기준값 설정 
		
	
		String operand[];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계산식: ");
		
		String line = scanner.nextLine();
		scanner.close();
		
		operand = line.split("[+*/-]");
		
		System.out.println("피연산자 분리결과: ");
		
		for(int n = 0; n< operand.length; n++) {
			operand[n] = operand[n].trim();
			System.out.println(operand[n]);
		}
		
//		double [] d_operand;
//		
//		d_operand = new double[]
	}

}
