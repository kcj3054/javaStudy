package employee;

public class FullTimeEmp extends Employee {
	// 필드 선언
	private int id; 
	private String name;
	private int grade;
	private DepartmentEnum department;
	private PositionEnum position;
	
	public FullTimeEmp() {
		// 코드 작성
		System.out.println("입력하시오");
	}

	public FullTimeEmp(int id, String name, DepartmentEnum department, PositionEnum position, int grade) {
		// 코드 작성
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.department = department;
		this.position = position;
	}
	

	public void print() {
		// 코드 작성
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
	// setters 및 getters 정의
}
