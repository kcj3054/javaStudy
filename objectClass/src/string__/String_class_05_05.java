package string__;

public class String_class_05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	 == �����ڴ� �ΰ��� ���۷����� �������� Ȯ���Ѵ� d
		String str1 = "java";
		String str2 = "java";
		if(str1 == str2) {
			System.out.println("������1");
		}
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		if(str3 == str4) {
			System.out.println("������");
		}
		
		if(str3.contentEquals(str4)) {
			System.out.println("������ 2");
		}
	}

}
