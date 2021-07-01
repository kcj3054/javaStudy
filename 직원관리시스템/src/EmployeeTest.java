import java.util.Scanner;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		int input;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			int sinput;
			input = mainMenu(scanner);
			if (input == 1) {
				do {
					
					sinput = registerMenu(scanner);
					
					if (sinput == 11) {
						//System.out.println(">>> 정규직 등록 <<<");
						
					} else if (sinput == 12) {
						//System.out.println(">>> 임시직 등록 <<<");
					}
				} while (sinput != 19);
			} else if (input == 2) {
				do {
					sinput = searchMenu(scanner);
					if (sinput == 21) {
						//System.out.println(">>> 일괄 검색 <<<");
					}
				} while (sinput != 29);
			}
		} while (input != 9);
		scanner.close();
		System.out.println("Good Bye!");
	}

	static int mainMenu(Scanner scanner) {
		int input;
		printMainMenu();
		input = getMainMenu(scanner);
		return input;
	}

	static void printMainMenu() {
		/* 코드 작성 */
		System.out.println("======== Main Menu ===");
		System.out.println("1. 직원 등록");
		System.out.println("2. 직원 검색");
		System.out.println("9. 프로그램 종료");
	}

	static int getMainMenu(Scanner scanner) {
		/* 코드 작성 */
		System.out.println("선택>>> ");
		int sinput = scanner.nextInt();
		
		if (sinput == 1) {
			System.out.println("======== Register Menu ===");
			System.out.println("11. 정규직 등록");
			System.out.println("12. 임시직 등록");
			System.out.println("19. 돌아가기");
		}
		else if(sinput== 2){
			System.out.println("======== Search Menu ===");
			System.out.println("21. 일괄 검색");
			System.out.println("29. 돌아가기");
		}
		else if(sinput == 9) {
			System.out.println("Good BYE");
		}
		else
			System.out.println("InValid Input. Try again");
	
		return sinput;
	}
	

	static int registerMenu(Scanner scanner) {
		int input;
		//printRegisterMenu();
		input = getRegisterMenu(scanner);
		return input;
	}

	static void printRegisterMenu() {
		/* 코드 작성 */
		System.out.println("======== Register Menu ===\r\n" + 
				"11. 정규직 등록\r\n" + 
				"12. 임시직 등록\r\n" + 
				"19. 돌아가기");
	}

	static int getRegisterMenu(Scanner scanner) {
		/* 코드 작성 */
		int s = scanner.nextInt();
		
		
		System.out.println("선택>>> ");
			if(s == 11) {
			System.out.println(">>> 정규직 등록 <<<");
		}
			else if(s == 12) {
			System.out.println(">>> 임시직 등록 <<<");
		}
			else if(s == 19) {
			System.out.println(">>> 돌아가기<<<");
		}
			else{
				System.out.println("Invalid Input. Try again");
		}
		
		return s;
		
	}

	static int searchMenu(Scanner scanner) {
		int input;
		printSearchMenu();
		input = getSearchMenu(scanner);
		return input;
	}

	static void printSearchMenu() {
		/* 코드 작성 */
		System.out.println("======== Search Menu ===");
		System.out.println("21. 일괄 검색");
		System.out.println("29. 돌아가기");
	}

	static int getSearchMenu(Scanner scanner) {
		/* 코드 작성 */
		int input = scanner.nextInt();
		
		if(input ==21 ) {
			System.out.println(">>> 일괄 검색 <<<");
		}
		else if(input == 29) {
			System.out.println(">>> 돌아가기 <<<");
		}
		
		return input;
	}
}