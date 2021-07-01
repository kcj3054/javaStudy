package case2;

public class TestPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//외부 클래스 
class ThreadSub extends Thread
{
	int num;
	
	public ThreadSub(int num) {
		this.num = num;
	}
	
	@Override
	public void run()
	{
		LogWriter logger = LogWriter.getInstance();
		if ( num < 10)
			logger.log(num);
		else
			logger.log(num);
		
	}
}