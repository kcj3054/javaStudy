package step1;

class Book{
	String title;
	int price;
	int num;
	
	Book(){
		title = "�ڹ�Ŭ��������";
		price = 1000;
	}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	void print(){
		System.out.println("���� " + title);
		System.out.println("���� " + price);
		System.out.println("���� " + num);
}
}
public class MyBook {
	public void main(String[] args) {
		// TODO Auto-generated method stub

	//Book book = new Book();
	Book book = new Book("�ڹ� ������ ����", 20000);
	book.num = 5;
	book.print();
		
	}

}
