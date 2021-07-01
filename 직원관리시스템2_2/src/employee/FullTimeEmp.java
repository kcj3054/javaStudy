package employee;

public class FullTimeEmp extends Employee {
	// �ʵ� ����
	private int id; 
	private String name;
	private int grade;
	private DepartmentEnum department;
	private PositionEnum position;
	
	public FullTimeEmp() {
		// �ڵ� �ۼ�
		System.out.println("�Է��Ͻÿ�");
	}

	public FullTimeEmp(int id, String name, DepartmentEnum department, PositionEnum position, int grade) {
		// �ڵ� �ۼ�
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.department = department;
		this.position = position;
	}
	

	public void print() {
		// �ڵ� �ۼ�
		System.out.println();
		System.out.println("===============");
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("department: " + department.getMessage());
		System.out.println("position: " + position.getPosition());
		System.out.println("grade: " + grade);
	}

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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public DepartmentEnum getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentEnum department) {
		this.department = department;
	}

	public PositionEnum getPosition() {
		return position;
	}

	public void setPosition(PositionEnum position) {
		this.position = position;
	}
	// setters �� getters ����
}
