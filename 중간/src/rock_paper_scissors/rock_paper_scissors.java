package rock_paper_scissors;

import java.util.Scanner;

public class rock_paper_scissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		
		System.out.println("���� ���� ���� �� ���� ����");
		
		while(true) {
			System.out.print("���� ���� ��! >> ");
			String User = sc.next();
			
			int Ai = (int)(Math.random()*3);
			
			if(User.equals("��")) {
				System.out.print("������ �����մϴ�...");
				break;
			}
			else if(str[Ai].equals("����")) {
				if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(User.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
			}
			else if(str[Ai].equals("����")) {
				if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
				else if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(User.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(str[Ai].equals("��")) {
				if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
				}
				else if(User.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
				}
			}
		}
	}
}
