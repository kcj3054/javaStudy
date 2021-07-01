package test_06;

import java.util.Random;

public class DynamicArray_2 {
	
	public static void main(String[] args) {

		int num[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	
		int count = 0;
		
		int i,j;
		
		while( count < 10) {
			i = (int)Math.round(Math.random() * 3);
			j = (int)Math.round(Math.random() * 3);
			
			if(num[i][j] ==0) {
				num[i][j] = (int)Math.round(Math.random() * 9 +1);
				count ++;
			}
		}
	
		for(i= 0; i< 4 ; i++) {
			for(j = 0; j<4; j++) {
				System.out.printf("%2d", num[i][j]);
			}
			System.out.println();
		}
	
	}
}
