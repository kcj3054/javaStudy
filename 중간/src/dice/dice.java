package dice;

public class dice {

	public static void main(String[] args) {
		
		
		
		
		int cnt = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt5 = 0;
		int cnt6 = 0;
		
		System.out.println("==============");
		System.out.println("¸é    ¹øµµ");
		System.out.println("==============");
		
		
		while(cnt < 100) {
			int num = (int)(Math.random() * 6) + 1;
			
			if(num == 1) cnt1++;
			else if(num == 2) cnt2++;
			else if(num == 3) cnt3++;
			else if(num == 4) cnt4++;
			else if(num == 5) cnt5++;
			else if(num == 6) cnt6++;
			
			cnt++;
		}
		
		 
		System.out.println("1    "+cnt1);
		System.out.println("2    "+cnt2);
		System.out.println("3    "+cnt3);
		System.out.println("4    "+cnt4);
		System.out.println("5    "+cnt5);
		System.out.println("6    "+cnt6);
	}

}
