package ex_13_classCastException;

class PBoard{}
class CBoard extends PBoard {}


public class ClassCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PBoard sbd1 = new CBoard();
		CBoard sbd2 = (CBoard)sbd1;
		
		PBoard ebd1 = new PBoard();
		
		CBoard ebd2 = (CBoard)ebd1; //이거는 안됌 컴파일전에는 모른다 
	}

}
