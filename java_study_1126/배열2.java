package java_study_1126;

import java.util.Random;

public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		
		int []numbers = new int[10];
		
		Random random  = new Random();
		numbers [0] = random.nextInt(100)+1;
		
		System.out.println("0번째 인덱스 값은 :"+numbers[0]);
		
		 for(int i=0; i<numbers.length; i++) {
	         numbers[i] = random.nextInt(100)+1;
		    System.out.println(" 값은 :"+numbers[1]);
	     }

	}
}
