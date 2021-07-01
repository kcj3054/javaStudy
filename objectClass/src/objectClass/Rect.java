package objectClass;


//toString 재정의 가능 
public class Rect {

	int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	public String toString() {
		
		return "Rect(" + width +"," +height + ")";
	}
	public static void main(String[] args) {
		
		Rect p = new Rect(15, 20);
		
		System.out.println(p.getClass().getName()); // 클래스 이름 
		System.out.println(p.hashCode()); // 해스코드 값, 고유의 값 
		System.out.println(p.toString()); //객체의 문자열 
		System.out.println(p);

	}

}
