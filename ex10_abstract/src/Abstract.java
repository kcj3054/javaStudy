abstract class Animal {
	int age;
	abstract void cry();
}

class Dog extends Animal{

	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("港港");
	}
	
}
class Cat extends Animal {

	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("具克 具克");
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog= new Dog();
		Cat cat = new Cat();
		
		dog.cry();
		cat.cry();
	}

}
