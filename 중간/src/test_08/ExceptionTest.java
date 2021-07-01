package test_08;

public class ExceptionTest {

	public static void main(String[] args) {

		//형식 오류 문자열을 숫자로 ? x 
		try {
		int num = Integer.parseInt("ABC");
		System.out.println(num);
		}catch (NumberFormatException e) {
			System.out.println("형식 오류입니다");
		}catch(Exception e) {
			
		}
	}

}
