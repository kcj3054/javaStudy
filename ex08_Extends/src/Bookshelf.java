
class Book{
	String title;
	public void printBook() {
		System.out.println("Ÿ��Ʋ " + title);
	}
}

class Novel extends Book{
	String writer;
	
	void printNov() {
		printBook();
		System.out.println("�� �� " + writer);
	}
}

class Magazzine extends Book{
	int day;
	void printMag() {
		printBook();
		System.out.println("�߸��� " + day);
	}
}

public class Bookshelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novel nov = new Novel();
		nov.writer = " �� â ��";
		nov.title = "â �� �� �� �� ";
		
		Magazzine mag = new Magazzine();
		mag.title = "�Ű����� â��";
		mag.day = 30;
		mag.printBook();

	}

}
