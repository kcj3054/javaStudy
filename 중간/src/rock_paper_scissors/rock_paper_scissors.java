package rock_paper_scissors;

import java.util.Scanner;

public class rock_paper_scissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("지는 가위 바위 보 게임 시작");
		
		while(true) {
			System.out.print("가위 바위 보! >> ");
			String User = sc.next();
			
			int Ai = (int)(Math.random()*3);
			
			if(User.equals("끝")) {
				System.out.print("게임을 종료합니다...");
				break;
			}
			else if(str[Ai].equals("가위")) {
				if(User.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
				}
				else if(User.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
				}
				else if(User.equals("보")) {
					System.out.println("사용자 = 보, 컴퓨터 = 가위, 사용자가 이겼습니다.");
				}
			}
			else if(str[Ai].equals("바위")) {
				if(User.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터 = 바위, 사용자가 이겼습니다.");
				}
				else if(User.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
				}
				else if(User.equals("보")) {
					System.out.println("사용자 = 보, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
				}
			}
			else if(str[Ai].equals("보")) {
				if(User.equals("가위")) {
					System.out.println("사용자 = 가위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
				}
				else if(User.equals("바위")) {
					System.out.println("사용자 = 바위, 컴퓨터 = 보, 사용자가 이겼습니다.");
				}
				else if(User.equals("보")) {
					System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
				}
			}
		}
	}
}
