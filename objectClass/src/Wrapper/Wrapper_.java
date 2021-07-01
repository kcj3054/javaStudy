package Wrapper;

//Wrapper 클래스는  자바 기본 데이터 타입을 클랫흐화한 8개 클래스,
//기본 데이터 타입을 사용하지 못하고 객체만 사용하는 경우에 사용 가능 
//Wrapper byte
public class Wrapper_ {

	public static void main(String[] args) {
		
//		Integer i = new Integer(10);
//		Character c = new Character('c');
//		Float f = new Float(3.14);
//		Boolean b = new Boolean(true);
//
//		//문자열을 생성자 인자로 사용해도 된다 , character 클래스만 제외하고 지원한다. 
//		Integer i1 = new Integer("100");
//		
//		String str1 = "java"; //string 리터럴
//		
//		char data[]  = {'j', 'a', 'v', 'a'};
//		
//		String str2 = new String(data);
//		
//		String ced = "ced";
//		
//		System.out.println("abc" + ced);
//		
//		String c2 = "abc".substring(2, 3);
//		
//		System.out.println(c2);
	
		//equals로 문자열비교 ㅇ
		
//		if("java".equals("java")) {
//			System.out.println("동일함 ");
//		}
//		
//		
		
		
//		//int compareTo(String str), 0동일, 음수(사전 순서 먼저), 양수(사전 순서 이후)
//		String java = "java";
//		String android = "android";
//		int result = android.compareTo(java);
//		System.out.println(result);
//		//android의 a가 java의 j보다 9갯수 앞서니 -9가 출력된다.
//		
//		//concat 문자열 결합 
//		String src = "hello";
//		String resul2t = src.concat("java");
//		System.out.println(resul2t);
//		
		//replace 부분문자열 대치 
		String src3 = "c++ 는 재미있고 c++은 쉽다";
		String result3 = src3.replace("c++", "java");
		System.out.println(result3);
		
		//split 현재 문자열을 부분문자열로 분리 
		//trim은 앞뒤 공백제거 
		
		String trim = "  4";
		String trim_result  = trim.trim();
		System.out.println(trim_result);
		
		//substring 부분 문자열 반환
		String sub = "hava a nice day";
		String sub_result = sub.substring(5);
		System.out.println(sub_result);
		
		String sub1 = "hava a nice day";
		String sub1_result = sub1.substring(7, 11);
		System.out.println(sub1_result);
		
		//StringBuffer, StringBuiler 클래스 
		//저장된 문자열 빈ㄴ번히 변화가 발생 할 경우 제공
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
