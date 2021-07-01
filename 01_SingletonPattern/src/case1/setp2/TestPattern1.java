package case1.setp2;

public class TestPattern1 {

	public static void main(String[] args) {
		Database database;
		
		database = Database.getInstance("첫 번째 DATABASE");
		System.out.println("This is the " + database.getName());
		
		database = Database.getInstance("두번째 database");
		System.out.println("This is the " + database.getName());

		//만약 사용자가 
		//Database d1 = new Database("1");
		//이거 방지하기위해서 데이터베이스 생성자 private로 해준다 
	}

}
