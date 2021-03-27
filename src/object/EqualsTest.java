package object;

//== 인스턴스 메모리가 같냐, 물리적
// equals 문자열이 동일하냐, 주소를 보는것이 아니다, 논리적

import java.util.Objects;

class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {

            Student std = (Student)obj;
            if(std.studentID ==  studentID) return true;
            return false;
        }
        return  false;
    }

    @Override
    public int hashCode() {
        int result = studentID;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        return result;
    }
}
public class EqualsTest {

    public static void main(String [] args) {

        Student std1 = new Student(10001, "Tomas");
        Student std2 = new Student(10001, "Tomas");

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));
    }
}
