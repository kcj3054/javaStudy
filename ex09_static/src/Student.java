
public class Student {

	private static int serialNum = 10000;
	
	int studentId;
	int studentName;
	
	//static 변수 serialNum  인스턴스가 new될때마다 ++된다
	//!!! 1. 인스턴스는 new하면 heap메모리에 할당된다 (동적메모리 공간)
	//!!! 2. staic은 데이터 영역에 할당 , 코드가 load되는 시점부터 할당된다 
	Student() {
		serialNum++;
		studentId = serialNum;
	}
	
	public static int getSerialNum() {
		
		//studentName = "김창주";  static 메소드 안에 인스턴스 변수 x 안된다 생성 시점이 다르니깐 
		return serialNum;
	}
	
}
