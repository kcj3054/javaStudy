package step2;

class Book{
	String title;
}
public class HeapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "�ڹ� Ŭ������ ����";
		book2.title = "�ڹ� ������  ����";
		
		System.out.println(book1.title);
		System.out.println(book2.title);
		
		book1 = null;
		book2 = null;
		
	}

}
