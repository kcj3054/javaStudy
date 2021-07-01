package ex11_interface;

//interface는 인자가 없다 .
interface Greet {
	void greet();
}

interface Bye {
	void bye();
}

//interface는 여러개 동시에 사용가능 
class Morning implements Greet, Bye{

	@Override
	public void bye() {
		// TODO Auto-generated method stub
		System.out.println("바이");
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("하이");
	}
	
}
public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Morning morn = new Morning();
		
		morn.bye();
		morn.greet();
	}

}
