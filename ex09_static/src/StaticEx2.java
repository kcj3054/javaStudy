import java.util.Random;

//�ν��Ͻ� ������ ���� ���� static ������ �޸� ������ �Ҵ�ɶ� ����ȴ�
// static�� ���� �ν��Ͻ�����  ���� �޸��� ���� ���� �ؼ� ����Ҷ� ����Ѵ� 
// 
public class StaticEx2 {

	static int num;
	static int numValue;
	
	//static �ʱ�ȭ��� 
	static {
		Random rand = new Random();
		//main ���� ���� �̹� �������� ������ �ȴ� 
		num = rand.nextInt(100);
	}
	
	static {
		Random rand2 = new Random();
		numValue = rand2.nextInt(200);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(num);
		System.out.println(numValue);
	}

}
