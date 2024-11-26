package java_study_1126;

public class 반복문 {

	public static void main(String[] args) {
		/*이중 for문
		 * 
		 */
		//반복문이 다른 반복문을 내포하는 구조

		 for(int i=0; i<3; i++) {
		 System.out.print("아우터 for문");
		  for(int j=0; j<3; j++) {
		  System.out.print("이너 for문");
		
	   }

   }
	
	   // 구구단 (이중 for문)
	for(int i=2; i<= 9; i++) {
		for(int j=1; i<= 9; i++) {
			System.out.print(i+"*"+j+"="+ i * j);
		}
		
	}
	
	
	
	  //이중 for문
	    int a = 5;
	    int b = 3;
	    for(int i=0; i<b; i++) {
			for(int j=0; j<a; j++) {
		        System.out.print("*");
			} 
			System.out.println();
	    }
	    
	    
	    for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
			    System.out.print("*");
			}
	        System.out.println();
	      }
	    
	    
	    	
	    	for(int i=5; i >=5; i++) {
		    	for(int j=0; j<=1; j++) {
				    System.out.print("*");
				}
		        System.out.println();
		      }
	    
	    
	    