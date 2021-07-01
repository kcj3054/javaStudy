package step1;

class Book{
	String title;
	int price;
	int num;
	
	Book(){
		title = "자바클래스기초";
		price = 1000;
	}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	void print(){
		System.out.println("제목 " + title);
		System.out.println("가격 " + price);
		System.out.println("수량 " + num);
}
}
public class MyBook {
	public void main(String[] args) {
		// TODO Auto-generated method stub

	//Book book = new Book();
	Book book = new Book("자바 디자인 패턴", 20000);
	book.num = 5;
	book.print();
		
	}

}
