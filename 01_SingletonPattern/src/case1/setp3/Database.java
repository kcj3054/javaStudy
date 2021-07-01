package case1.setp3;

public class Database {

	private static Database singleton = new Database("products");
	private String name;
	
	private Database(String name) {
		//super();
		//this.name = name;
		try {
			Thread.sleep(100);
			this.name = name;
		}catch ( Exception e) {
			
		}
	}
//synchronized ���ÿ� �����尡 ��û���ص� �տ� �����尡 �����⸦ ��ٸ��� ,synchronized�� ��δ� 
	public static Database getInstance(String name) {
		return singleton;
	}
	public String getName() {
		return name;
	}
	
}
