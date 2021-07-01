
//eclipse ���� ������ ���� file -> new -> enum���� �������� 
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
		//�������� ���������� ��ü�� �ȴ� , new������ �����ص� ���������δ� ��ü�εȴ�. 
		
		Week tomorrow = Week.SATURDAY;
		
		String day = today.name(); // ������ ��ü�� string�� ��ȯ FRIDAY
		
		int ordinal = today.ordinal() // today�� index�� ��ȯ�ϴ� 4����ȯ�Ѵ� 
		
		int diff1 = today.compareTo(tomorrow); // -1��ȯ 
		int diff2 = tomorrow.compareTo(today); // 1��ȯ 
		
		Week weekend = Week.valueOf("SUNDAY") //Week.SUNDAY 
		Week [] days = Week.values();  // Week enum�� �������ִ� �������� �迭�� ��ȯ 
		for(Week d : days) {
			System.out.println(d);
		}
		
	}

}
