package test_16;

public class ColoredRectangle extends Rectangle {

	private int x, y;
	private int width, height;
	private String color;
	
	public ColoredRectangle() {
		System.out.println("ColoredRectangle Constuctor");
	}
	
	public ColoredRectangle(int x, int y, int width, int height, String color) {
		super(x, y, width, height);
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		
		System.out.println("ColoredRectangle Constuctor");
	}
	
     
}
