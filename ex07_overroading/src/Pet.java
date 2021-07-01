class Animal{
	String name;
	int age;
	
	void printPet() {
		System.out.println("이름 " + name);
		System.out.println("나이 " + age);
	}
}

class Dog extends Animal{
	String variety;
	
	void printPet() {
		super.printPet();
		System.out.println("종 류 " + variety);
	}
}
public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.name  = " 달 이";
		dog.age = 5;
		dog.variety = "진 돗 개";
		dog.printPet();
	}

}
