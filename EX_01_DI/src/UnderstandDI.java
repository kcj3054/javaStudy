import java.util.Date;

public class UnderstandDI {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println();

	}
	public static void getDate(Date d) {
		Date date = d;
		System.out.println(d);
	}
		public static void memberUse1() {
			//���� ����
			Member m1 = new Member();
		}
		
		public static void memberUse2(Member m) {
			Member m2 = m;
		}
	}




//Member�� ����Ѵ� -> member�� ��ɿ� �����Ѵٶ�� �ǹ� .
class Member {
	String nam;
	String nickname;
	
	private Member() {} //private�� ���Ѱ����� ������ ���� �ʴ´�  ������� ���� ���Թ޴� ���̶�... 
}