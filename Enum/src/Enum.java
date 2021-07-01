
//eclipse 에서 열거형 생성 file -> new -> enum으로 생성가능 
public class Enum {

	public enum Week{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Week today;
		today = null;
		today = Week.FRIDAY;
		//열거형도 내부적으로 객체가 된다 , new연산자 사용안해도 내부적으로는 객체로된다. 
		
		Week tomorrow = Week.SATURDAY;
		
		String day = today.name(); // 열거형 객체의 string값 반환 FRIDAY
		
		int ordinal = today.ordinal() // today의 index를 반환하니 4를반환한다 
		
		int diff1 = today.compareTo(tomorrow); // -1반환 
		int diff2 = tomorrow.compareTo(today); // 1반환 
		
		Week weekend = Week.valueOf("SUNDAY") //Week.SUNDAY 
		Week [] days = Week.values();  // Week enum이 가지고있는 열거형의 배열을 반환 
		for(Week d : days) {
			System.out.println(d);
		}
		
	}

}
