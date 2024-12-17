package java_study_1217;
/*
 * 객체지향 개념
 * 
 * 필드변수(전역변수), 메소드, 생성자로 구성된다
 */

		class 자동차{
			
			/*
			 * 1. default 초기값이 존재한다
			 * 2. 모든 메소드에서 필드변수를 사용할 수 있음
			 * 3. 필드변수 => 속성(attribute)
			 */
			String 브랜드명; //필드변수
			String 자동차타입;
			
			public 자동차()   {
				
			}
			
			
			/*
			 * 
			 * 
			 * 
			 * 
			 */
			
			
		}	
			/*
			 * public : 접근지정자(public, private, protected, default)
			 * int : 리턴 데이터 타입
			 * getNumber : 메소드 이름
			 * (int x, int y) : 파라미터
			 */
			
			public int getNumber(int x, int y) {
			       int result = x+y;
			       return result;
		}
			
			
			
		   public int getMoney(int price)  {
			   
			if  (price >= 500000 ) {
				price *= 0.8;
			 }else if  (price >= 300000 ) {
			    price *=0.9;
		     }else if  (price >= 100000 ) {
				price *=0.95;
		     }
			    return price;
			    
		   }
}
					        //  total Money= 0.8;
							// total Money=0.9;
							// total Money=0.95;
					 
			   
			   return price;
		   }
			
		   //정수를 담고 있는 배열arr가 파라미터로 주어졌을때 
		   //arr의 평균값을 return하는 함수 getAvg를 완성
		/*
		 *    1.메소드
		 *    getAvg
		 *    2.로직 구현
		 */
		   
		   public double getAvg(int[] arr) {

		   
			   double avg = 0; 
			   // 메소드안에 있는 변수
			   double sum = 0;
			   for (int i : arr) {
				   sum += i;
			   }
			   avg = sum / arr.length;
			   return avg;
		   
		   
			   /*
			    * 정수를 담고 있는배열 arr가 파라미터로 주어졌을 떄
			    *배열 값 중 원소가 짝수면 해당원소를 2로 나누고 다시 해당 원소에 대입
			    * 최종 배열 arr를 return하는 함수 getArr를 왼성
			    */
			   
			   
			   public int[] getArr(int[] arr) {
			   
			            for (int i=0; i<arr.length; i++) {
			            	int index = arr[i];
			                if(index % 2 == 0)
			            	      arr[i] = index / 2;
				   
			            }
				   
			     }
				   
				   return arr;
				   
			   }
			   
		   
		   
		   /*
		    * 정수를 담고 있는배열 arr가 파라미터로 주어졌을 떄
		    * 배열 arr에 총합을 ㄱreturn하는 getArrSum
		    */
		   
		   
		   
		   public int[] getArrSum(int[] arr) {
			   
	            for (int i=0; i<arr.length; i++) {
	            	System.out.println("합계 : ");
	            }

		             return arr;
		   }
			public class 복습 {

				public static void main(String[] args) {
			         //zmffotm 클래스 호출
					자동차 car1 = new 자동차();
					//new : 클래스를 호출
			
					int 리턴값 =  car1.getNumber(10, 20);
					System.out.println("리턴 결과"+ 리턴값);
					int 최종값 = car1.getMoney(340000);
					System.out.println("결과"+최종값);
					
					
					int[] array = {80, 90, 100, 100};
					double 평균값 = car1.getAvg(array);
		}
	}

}
