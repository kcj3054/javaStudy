import java.util.Scanner;

public class math {

	public static void main(String[] args) {
		
		//abs(), ceil(), min, max, round, �ﰢ�Լ�.. ������ȯ.. ���� �α��Լ� 
		//��� �޼ҵ�� �����޼ҵ� ���·� ���� 
		
		//math.random() �޼ҵ�� 0�̻� 1�̸� ���� �߻� 
		//1������ `12�� ������ �� ������ 
		//int(Math.random() * 12 +1)  12�����ϸ� 0�̻� 12�̸� +1�ϸ� 1�̻� 12���� 

		//java.util.random Ŭ���� ��� ���� 
		//nextInt() ������ ���� ���� int ��ȯ 
		//int nextInt(int bound)  0���� bound������ int ��ȯ 
		
		//void setSeed(long seed) seed�� ���� , ������ ���ذ� ���� 
		
	
		String operand[];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����: ");
		
		String line = scanner.nextLine();
		scanner.close();
		
		operand = line.split("[+*/-]");
		
		System.out.println("�ǿ����� �и����: ");
		
		for(int n = 0; n< operand.length; n++) {
			operand[n] = operand[n].trim();
			System.out.println(operand[n]);
		}
		
//		double [] d_operand;
//		
//		d_operand = new double[]
	}

}
