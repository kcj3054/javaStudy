package study;

public class GenericMethodTest<T> {

	T data;
	
	T get() {
		
		return data;
		
	}
	
	void set(T data) {
		
		this.data = data;
		
		}
	public static <T> void printArray(T  [] someArray) {
		for(int i= 0; i<someArray.length ; i++) {
			System.out.print(someArray[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		GenericMethodTest<String> sObj = new GenericMethodTest<>();
		
		Integer [] intArray = {1, 2, 3, 4, 5 };
		Double [] doubleArray = {5.1, 1.3, 3.7};
		Character [] charArray = {'j', 'a', 'v', 'a'};
		
		System.out.println("정수 배열: ");
		GenericMethodTest.<Integer>printArray(intArray);

		System.out.println("실수 배열: ");
		GenericMethodTest.<Double>printArray(doubleArray);

		System.out.println("문자 배열: ");
		GenericMethodTest.<Character>printArray(charArray);

		}
	}

