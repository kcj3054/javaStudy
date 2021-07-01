package test_10;

public class Date {
	
	int year = 1990, day = 1;
	String month = "1";
	
	//code 
	public Date(int year, String month, int day) {
		
		this.year = year;
		this.month = month;
		this.day = day;
		
	}
	public Date() {

	}
	public Date(int year) {
		this.year = year;
	}
	public String toString() {
		return "Date [year=" + year +", month="+month+", day="+day+"]";
	}

	public static void main(String[] args) {

		Date date1 = new Date(2015,"8¿ù", 10);
		Date date2 = new Date(2020);
		Date date3 = new Date();
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}

}
