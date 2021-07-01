package toString;

public class toString {

	int width, height;
	
	public toString(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	public String toString() {
		return "Rect(" + width + "," + height + ") ";
	}
	public static void main(String[] args) {
		
		toString p = new toString(15, 20);
		System.out.println(p.toString());
		System.out.println(p);

	}

}
