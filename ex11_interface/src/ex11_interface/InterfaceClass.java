package ex11_interface;

//interface�� ���ڰ� ���� .
interface Greet {
	void greet();
}

interface Bye {
	void bye();
}

//interface�� ������ ���ÿ� ��밡�� 
class Morning implements Greet, Bye{

	@Override
	public void bye() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("����");
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
