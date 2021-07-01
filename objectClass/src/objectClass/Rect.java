package objectClass;


//toString ������ ���� 
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
		
		System.out.println(p.getClass().getName()); // Ŭ���� �̸� 
		System.out.println(p.hashCode()); // �ؽ��ڵ� ��, ������ �� 
		System.out.println(p.toString()); //��ü�� ���ڿ� 
		System.out.println(p);

	}

}
