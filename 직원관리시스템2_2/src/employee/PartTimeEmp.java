package employee;

public class PartTimeEmp extends Employee {
	// 필드 선언
	private int id;
	private String name;
	private DepartmentEnum department;
	private int hours;
	
	public PartTimeEmp() {
		// 코드 작성
		System.out.println("입력하시오");
	}

	public PartTimeEmp(int id, String name, DepartmentEnum department, int hours) {
		// 코드 작성
		this.id = id;
		this.name = name;
		this.department = department;
		this.hours = hours;
	}
	
	public void print() {
		// 코드 작성
		System.out.println();
		System.out.println("===============");
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("department: " + department.getMessage());
		System.out.println("hours: " + hours);
	}
	

	// setters 및 getters 정의

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
