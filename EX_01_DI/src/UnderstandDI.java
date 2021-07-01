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
			//강한 결합
			Member m1 = new Member();
		}
		
		public static void memberUse2(Member m) {
			Member m2 = m;
		}
	}




//Member를 사용한다 -> member의 기능에 의존한다라는 의미 .
class Member {
	String nam;
	String nickname;
	
	private Member() {} //private라도 약한결합은 영향을 받지 않는다  만들어진 것을 주입받는 것이라서... 
}