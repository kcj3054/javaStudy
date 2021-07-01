package test_24;

import java.util.Scanner;

class AlphaHisto {
	
	Alpha [] alpha;
	char a = 'A';
	
	public void setAlpha() {
		alpha = new Alpha[26];
		for(int i =0; i< 26; i++) {
			alpha[i] = new Alpha(a);
			a++;
		}
	}
	
	
	public String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String line = sc.nextLine();
			if(line.length() == 1 && line.charAt(0)==';')break;
			
			sb.append(line);
		}
		return sb.toString();
	}
	
	public void Count(String a) {
		int num = 0;
		char a1 = 'A';
		char a2 = 'a';
		
		
		while(num < 26) {
			int count = 0;
			for(int i =0; i<a.length(); i++) {
				if(a.charAt(i) == a1 || a.charAt(i) == a2) {
					count ++;
				}
			}
			
			alpha[num].setCount(count);
			num++;
			a1++;
			a2++;
		}
	}
	
	public void Draw() {
		System.out.println("������׷��� �׸��ϴ�.");
		for(int i =0; i< 26 ; i++) {
			System.out.println(alpha[i].getAlphabet());
			for(int j=0; j<alpha[i].getCount(); j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}
}

class Alpha{
	private char alphabet;
	private int count = 0;
	
	public Alpha(char a) {
		this.alphabet =a;
	}
	
	public char getAlphabet() {
		return alphabet;
	}
	
	public void setAlphabet(char alphabet) {
		this.alphabet = alphabet;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}

	
}
public class AlphaHistoEx {

	public static void main(String[] args) {

		AlphaHisto ah = new AlphaHisto();
		
		ah.setAlpha();
		System.out.println("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���");
		ah.Count(ah.readString());
		ah.Draw();
		
}

}
