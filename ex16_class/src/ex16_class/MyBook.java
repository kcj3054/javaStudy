package ex16_class;

public class MyBook {
	
	private String title;
	public  String author;
	
	public MyBook(String title) {
		this.title =title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}