package generic_method;

public class generic_method {

	public static <T> boolean isEqual(T obj1, T obj2) {
		boolean result = obj1.equals(obj2);
		return result;
	}
	
	public static void main(String[] args) {

		//static�̶� ��ü�� �������ص��ȴ�.
		//static�� ������ ��ü�� �����ؾ��Ѵ� .
		
		String java = new String("java");
		String python = new String("python");
		boolean result = generic_method.<String>isEqual(java, python);
		System.out.println("ù��° ��� "+result);
		
		Integer n1 = 7;
		Integer n2 = 19;
		
		result = generic_method.<Integer>isEqual(n1, n2);
		System.out.println("�ι�° ���  "+result);
		
	}

}
