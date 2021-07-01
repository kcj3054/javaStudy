package case1.setp2;

public class Database {

	private static Database singleton;
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
//synchronized 동시에 쓰레드가 요청을해도 앞에 쓰레드가 끝나기를 기다린다 ,synchronized는 비싸다 
	public synchronized static Database getInstance(String name) {
		if(singleton == null) {
			singleton = new Database(name);
		}
		return singleton;
	}
	public String getName() {
		return name;
	}
	
}
