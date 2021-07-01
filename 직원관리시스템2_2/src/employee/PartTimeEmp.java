package employee;

public class PartTimeEmp extends Employee {
	// �ʵ� ����
	private int id;
	private String name;
	private DepartmentEnum department;
	private int hours;
	
	public PartTimeEmp() {
		// �ڵ� �ۼ�
		System.out.println("�Է��Ͻÿ�");
	}

	public PartTimeEmp(int id, String name, DepartmentEnum department, int hours) {
		// �ڵ� �ۼ�
		this.id = id;
		this.name = name;
		this.department = department;
		this.hours = hours;
	}
	
	public void print() {
		// �ڵ� �ۼ�
		System.out.println();
		System.out.println("===============");
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("department: " + department.getMessage());
		System.out.println("hours: " + hours);
	}
	

	// setters �� getters ����

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentEnum getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentEnum department) {
		this.department = department;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
