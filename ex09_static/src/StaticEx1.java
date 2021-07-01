
class Cat {
	static int a = 5;
	int num = 3;
	
	void print(int num3) {
		System.out.println("a " + a);
		num = num3;
		System.out.println("num " + num);
	}
}
public class StaticEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + ", " + num2);
		
		Cat cat1 = new Cat();
		cat1.num = 1;
		cat1.a = 10;
		cat1.print(20);
	}

}
