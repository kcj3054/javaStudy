
public class Book {

	private String name;
	private String author;
	
	public Book() {};
	public Book(String Name, String author) {
		
		this.name = Name;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public void setName(String name) {
		this.name  = name;
	}
	
	public void setAuthor(String author) {
		this.author  = author;
	}
	public void printInfo() {
		System.out.println(name + ", " + author);
	}
}
