package string__;

public class String_class_05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	 == 연산자는 두개의 레퍼런스가 같은지를 확인한다 d
		String str1 = "java";
		String str2 = "java";
		if(str1 == str2) {
			System.out.println("동일함1");
		}
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		if(str3 == str4) {
			System.out.println("힙영역");
		}
		
		if(str3.contentEquals(str4)) {
			System.out.println("동일함 2");
		}
	}

}
