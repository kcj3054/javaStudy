package test_07;

import java.util.Scanner;

public class Tic_Tac_Toe {
	public static void main(String[] args) {
		
		char[][] board = new char[3][3]; // �������� ��Ÿ���� 2���� �迭
		int x, y;
		
		Scanner scan  = new Scanner(System.in);
		
		// �������� ��Ÿ���� 2���� �迭�� �ʱ�ȭ
		for (int i = 0; i < 3; i++) 
			for (int j = 0; j < 3; j++)
				board[i][j] = ' ';
		
		do {
			
			// �������� �׸���.
			for (int i = 0; i < 3; i++) {
				System.out.println("  " + board[i][0] + "|  "
						+ board[i][1] + "|  " + board[i][2]); 
				if (i != 2) 
					System.out.println("---|---|---");				
			}
			
			System.out.print("���� ���� ��ǥ�� �Է��Ͻÿ�: ");
			x = scan.nextInt();
			y = scan.nextInt();
			
			// ����ڰ� ���� ��ġ�� �˻�
			if (board[x][y] != ' ') {
				System.out.println("�߸��� ��ġ�Դϴ�.");
				continue;
			} else {
				board[x][y] = 'X';
			}
			
			// ��ǻ�Ͱ� ���� ��ġ�� ����
			int i = 0, j = 0;
			outer :
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					if (board[i][j] == ' ') break outer;
				}
			}			
			if (i < 3 && j < 3) {
				board[i][j] = 'O';
			}
		} while (true);
	}
}