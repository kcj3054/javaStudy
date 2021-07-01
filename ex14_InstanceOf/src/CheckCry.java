
interface Cry {
	void cry();
}

class Cat implements Cry {
	
	public void cry() {
		System.out.println("具克");
	}
}

class Dog implements Cry {
	
	public void cry() {
		System.out.println("港 港");
	}
}
public class CheckCry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cry test1 = new Cat();
		if(test1 instanceof Cat) {
			test1.cry();
		}
		else {
			return;
		}
	}

}
