
class Book{
	String title;
	public void printBook() {
		System.out.println("타이틀 " + title);
	}
}

class Novel extends Book{
	String writer;
	
	void printNov() {
		printBook();
		System.out.println("저 자 " + writer);
	}
}

class Magazzine extends Book{
	int day;
	void printMag() {
		printBook();
		System.out.println("발매일 " + day);
	}
}

public class Bookshelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Novel nov = new Novel();
		nov.writer = " 김 창 주";
		nov.title = "창 주 의 역 사 ";
		
		Magazzine mag = new Magazzine();
		mag.title = "매거진즈 창주";
		mag.day = 30;
		mag.printBook();

	}

}
