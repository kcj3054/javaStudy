class Animal{
	String name;
	int age;
	
	void printPet() {
		System.out.println("�̸� " + name);
		System.out.println("���� " + age);
	}
}

class Dog extends Animal{
	String variety;
	
	void printPet() {
		super.printPet();
		System.out.println("�� �� " + variety);
	}
}
public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		dog.name  = " �� ��";
		dog.age = 5;
		dog.variety = "�� �� ��";
		dog.printPet();
	}

}
