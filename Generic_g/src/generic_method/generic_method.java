package generic_method;

public class generic_method {

	public static <T> boolean isEqual(T obj1, T obj2) {
		boolean result = obj1.equals(obj2);
		return result;
	}
	
	public static void main(String[] args) {

		//static이라서 객체를 생성안해도된다.
		//static이 없으면 객체를 생성해야한다 .
		
		String java = new String("java");
		String python = new String("python");
		boolean result = generic_method.<String>isEqual(java, python);
		System.out.println("첫번째 결과 "+result);
		
		Integer n1 = 7;
		Integer n2 = 19;
		
		result = generic_method.<Integer>isEqual(n1, n2);
		System.out.println("두번째 결과  "+result);
		
	}

}
