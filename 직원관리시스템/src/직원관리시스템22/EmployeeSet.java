package 직원관리시스템22;

import java.util.Scanner;

public class EmployeeSet {
	final int MAX_SIZE = 100; // 배열 길이
	Employee[] emp; // 직원
	int indexEmp; // 등록된 직원에 대한 인원 수

	int[] id = new int[3];
	String[] name = new String[3];
	int[] dept = new int[3];
	String[] deptS = new String[3];
	int[] position = new int[3];
	String[] positionS = new String[3];
	int[] grade = new int[3];

	public EmployeeSet() {
		emp = new Employee[MAX_SIZE];
		indexEmp = 0;
	}

// 1명의 직원 등록
	public void RegisterEmp(Scanner s) {
		for (int i = 0; i < 3; i++) {
			System.out.println(">>> 직원 등록 <<<");
			System.out.print(">> name : ");
			name[i] = s.next();
			System.out.println("부서 목록 : 총무(11) 인사(12) 기획(13) 생산(14) 영업(15)");
			System.out.print(">> department : ");
			dept[i] = s.nextInt();
			switch (dept[i]) {
			case 11:
				deptS[i] = "총무";
				break;
			case 12:
				deptS[i] = "인사";
				break;
			case 13:
				deptS[i] = "기획";
				break;
			case 14:
				deptS[i] = "생산";
				break;
			case 15:
				deptS[i] = "영업";
				break;
			}
			System.out.println("직위 목록 : 이사(21) 부장(22) 과장(23) 대리(24) 사원(25)");
			System.out.print(">> position : ");
			position[i] = s.nextInt();
			switch (dept[i]) {
			case 21:
				positionS[i] = "이사";
				break;
			case 22:
				positionS[i] = "부장";
				break;
			case 23:
				positionS[i] = "과장";
				break;
			case 24:
				positionS[i] = "대리";
				break;
			case 25:
				positionS[i] = "사원";
				break;
			}
			System.out.print(">> grade : ");
			grade[i] = s.nextInt();
		}
		s.nextLine(); //

		Employee employee = new Employee(name, deptS, positionS, grade);
	}

// 모든 직원의 정보 출력
	public void SearchAll() {
// 코드 작성
// 직원 정보 출력

		for (int i = 0; i < 3; i++) {
			int id = i + 10101;
			System.out.println("==================");
			System.out.println("id: " + id);
			System.out.println("name : " + name[i]);
			System.out.println("department : " + deptS[i]);
			System.out.println("position : " + positionS[i]);
			System.out.println("grade : " + grade[i]);
		}

	}
}