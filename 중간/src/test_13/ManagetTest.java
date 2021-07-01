package test_13;


class Employee {
	private String name, address;
	private int ID;
	protected int salary;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Employee() {
		
	}
	public Employee(String name, String address, int iD, int salary) {
		this.name = name;
		this.address = address;
		ID = iD;
		this.salary = salary;
	}

	
	
}

class Manager extends Employee{

	
	private int bonus;
	
	public Manager(String name, String address, int ID, int salary, int bonus) {
		super(name, address, ID, salary);
		
		this.bonus = bonus;
		
	}
	

	public void test() {
		System.out.println("name=" + super.getName());
		System.out.println("address=" + super.getAddress());
		System.out.println("salary=" + salary);
	}
	
}

public class ManagetTest {

	public static void main(String[] args) {
			Manager m = new Manager("Tom", "Seoul", 1000000, 123456, 50000);
			
			m.test();
		
	}

}
