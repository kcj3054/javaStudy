
public class StudentTest {

	public static void main(String[] args) {

		System.out.println(Student.getSerialNum()); // static 변수는 클래스 생성과 상관없이 바로 사용할 수 있다 
		Student stu1 = new Student();
		System.out.println(stu1.studentId);
		
		Student stu2 = new Student();
		System.out.println(stu2.studentId);
		
		System.out.println(stu1.getSerialNum());
		System.out.println(stu2.getSerialNum());
	}

}
