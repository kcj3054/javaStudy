
public class StudentTest {

	public static void main(String[] args) {

		System.out.println(Student.getSerialNum()); // static ������ Ŭ���� ������ ������� �ٷ� ����� �� �ִ� 
		Student stu1 = new Student();
		System.out.println(stu1.studentId);
		
		Student stu2 = new Student();
		System.out.println(stu2.studentId);
		
		System.out.println(stu1.getSerialNum());
		System.out.println(stu2.getSerialNum());
	}

}
