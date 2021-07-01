package test_11;

class Box {

	private int width, length, height;

	// code

	public Box(int width, int length, int height) {

		this.width = width;
		this.length = length;
		this.height = height;

	}

	@Override
	public String toString() {
		return "obj1 == obj2";
	}

	void isSameBox(Box obj1, Box obj2) {
		if (obj1.equals(obj2))
			System.out.println(obj1 + "==" + obj2 + "true");
		else
			System.out.println(obj1 + "==" + obj2 + "false");
	}
}

public class BoxTest {

	public static void main(String[] args) {

		Box obj1 = new Box(10, 20, 50);
		Box obj2 = new Box(10, 20, 50);
		Box obj3 = new Box(20, 30, 90);

		// 결과 출력 code
		obj1.isSameBox(obj1, obj2);
		obj2.isSameBox(obj1, obj3);
	}

}
