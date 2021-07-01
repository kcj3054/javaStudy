package ex_01_class_3;

class Book{
	String title;
	String author;
	int price;
}
public class MyBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book();
		
		book.title = "클래스의 기초";
		book.author = "김창주";
		book.price = 100;
		
		System.out.print("book.title : " + book.title +
						 "book.author : " + book.author +
						 "book.prince :" + book.price);
	}

}
