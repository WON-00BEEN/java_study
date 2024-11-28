package java_study_1128;

public class 복습 {

	public static void main(String[] args) {


		//1차원 배열 
		int []array = {1, 2, 3};
		
		//2차원 배열
		int [][] array2 = {{1,2,3}, {1,2,3}, {1,2,3}};	
		for(int i=0; i<array2.length; i++) {
			
			for(int j=0; j<array2[i].length; j++) {
				
			System.out.println("2차원 배열 출력"+array2[i][j]);
			}
		}
	
	      int [] array3 = new int[3];
	      String[] array4 = new String[4];
		  
		  array3 [0] = 0;
		  array4 [0] = "apple";
		
		array4[1] = Integer.toString(array3[0]);
		//Integer.toString(실무에서 자주 사용함) 숫자에서 문자료 형 변환
		//Integer.parseInt-문자에서 숫자로
	
	}
	
	

}
