package ex13_hiding;

class SimpleBox {
	private int num;

	SimpleBox(int num){
		this.num = num;
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	

	
}
public class ThisUseEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleBox simplebox = new SimpleBox(5);
		simplebox.setNum(10);
		System.out.println( simplebox.getNum());
	}

}
