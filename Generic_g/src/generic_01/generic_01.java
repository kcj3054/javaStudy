package generic_01;

//타입 매개 변수에 기본타입은 사용할수 없고 레퍼클래스만 사용가능하다 
//컬렉션은 제네릭타입을 사용한다 
//타입 매개변수가 나타내는 자료형의 객체는 생성 불가 

public class generic_01<T> {

	T data;
	
	T get() {
		return data;
	}
	
	void set(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {

		//구체적인 타입을 대입하여 변수 및 객체 생성 
		generic_01<String> sObj = new generic_01<>();
		sObj.set("java");
		
		//타입 t에 integer 지정 
		
		generic_01<Integer> iObj = new generic_01<>();
		iObj.set(7);
	}

}
