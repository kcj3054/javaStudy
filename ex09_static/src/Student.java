
public class Student {

	private static int serialNum = 10000;
	
	int studentId;
	int studentName;
	
	//static ���� serialNum  �ν��Ͻ��� new�ɶ����� ++�ȴ�
	//!!! 1. �ν��Ͻ��� new�ϸ� heap�޸𸮿� �Ҵ�ȴ� (�����޸� ����)
	//!!! 2. staic�� ������ ������ �Ҵ� , �ڵ尡 load�Ǵ� �������� �Ҵ�ȴ� 
	Student() {
		serialNum++;
		studentId = serialNum;
	}
	
	public static int getSerialNum() {
		
		//studentName = "��â��";  static �޼ҵ� �ȿ� �ν��Ͻ� ���� x �ȵȴ� ���� ������ �ٸ��ϱ� 
		return serialNum;
	}
	
}
