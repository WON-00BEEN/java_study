package java_study_1126;

public class 배열 {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40};
		System.out.println("0번째 배열 값 :"+ array[0]);
		System.out.println("1번째 배열 값 :"+ array[1]);
		
		
		int sum = array[1] + array[3];
		System.out.println("총 합 :"+ sum);  
		
		
	int[] array2 = {10,20,30,40,10,20,30,40,10,20,30,40};
		
		for(int i = 0; i<array2.length; i++) {
			System.out.println("배열 값: "+array2[i]);
		}
		
		
		
		
		
		int[] array3 = {2, 3, 4, 5, 6}; 

		for(int i = 0; i<array3.length; i++) {
			int num = array3[i];
			if (num % 2 == 0) {
			System.out.println("짝수 값: "+num);
		}
	
		
	 }
		
		
		

		int sum1 = 0;
		
		for(int i = 0; i<array3.length; i++) {
			sum1 += array3[i];
		    
			System.out.println("총합  :"+ sum1);
		    
		    System.out.println("평균값  :" + sum1/array3.length);
		
		
		
		
		
	}
}




