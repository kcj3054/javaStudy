package ���������ý���22;

import java.util.Scanner;

public class EmployeeSet {
	final int MAX_SIZE = 100; // �迭 ����
	Employee[] emp; // ����
	int indexEmp; // ��ϵ� ������ ���� �ο� ��

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

// 1���� ���� ���
	public void RegisterEmp(Scanner s) {
		for (int i = 0; i < 3; i++) {
			System.out.println(">>> ���� ��� <<<");
			System.out.print(">> name : ");
			name[i] = s.next();
			System.out.println("�μ� ��� : �ѹ�(11) �λ�(12) ��ȹ(13) ����(14) ����(15)");
			System.out.print(">> department : ");
			dept[i] = s.nextInt();
			switch (dept[i]) {
			case 11:
				deptS[i] = "�ѹ�";
				break;
			case 12:
				deptS[i] = "�λ�";
				break;
			case 13:
				deptS[i] = "��ȹ";
				break;
			case 14:
				deptS[i] = "����";
				break;
			case 15:
				deptS[i] = "����";
				break;
			}
			System.out.println("���� ��� : �̻�(21) ����(22) ����(23) �븮(24) ���(25)");
			System.out.print(">> position : ");
			position[i] = s.nextInt();
			switch (dept[i]) {
			case 21:
				positionS[i] = "�̻�";
				break;
			case 22:
				positionS[i] = "����";
				break;
			case 23:
				positionS[i] = "����";
				break;
			case 24:
				positionS[i] = "�븮";
				break;
			case 25:
				positionS[i] = "���";
				break;
			}
			System.out.print(">> grade : ");
			grade[i] = s.nextInt();
		}
		s.nextLine(); //

		Employee employee = new Employee(name, deptS, positionS, grade);
	}

// ��� ������ ���� ���
	public void SearchAll() {
// �ڵ� �ۼ�
// ���� ���� ���

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