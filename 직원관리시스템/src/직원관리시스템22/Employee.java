package 직원관리시스템22;

public class Employee {

	public Employee(String[] name, String[] deptS, String[] positionS, int[] grade) {
		this.name = name;
		this.deptS = deptS;
		this.positionS = positionS;
		this.grade = grade;
	}

	private int[] id = new int[3];
	private String[] name = new String[3];
	private int[] dept = new int[3];
	private String[] deptS = new String[3];
	private int[] position = new int[3];
	private String[] positionS = new String[3];
	private int[] grade = new int[3];

}