package test_16;

public class Rectangle extends Shape {

	private int x, y;
	private int width, height;
	
	public Rectangle() {
		System.out.println("Rectangle Constuctor");
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		System.out.println("Rectangle Constuctor");
	}
	
	
}
