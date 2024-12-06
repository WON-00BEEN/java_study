package java_study_1206;

public class 문제풀이 {

	public static void main(String[] args) {
		
		 //7번
	      int n = 15;
	      //7조각을 주는 이상한 피자가게
	      //상수 변수명은 대문자로
	      final int SLICE = 7; //한판에 7조각
	      int x = n % SLICE;
	      int result = n / SLICE;
	      if(x > 0) { 
	         ++result; 
	      }

		
		
		//8번 팩토리얼
		  //8번 팩토리얼
	      System.out.print("정수 입력받기 : ");
	      //Scanner scan = new Scanner(System.in);
	      int num = 5;
	      int factorial = 1;
	      for(int i=2; i<=num; i++) {
	         factorial = factorial * i;
	      }
	      System.out.println(num+"! ="+factorial);
	      

		
		
		
		//17번  
		        int [] array = {149, 180, 192, 170};
		        int height = 167;
		        int count = 0;
		        
		        for(int i: array)  {
		        	if(height < 1) {
		        		++count;
		        	}
		        }
		        System.out.println("정답 : "+count); {
		        	}
	
}

            //18qjq

	
    //10번 다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
    /*
      ****
      ***
      **
      *
     */
       for(int i=4; i>0; i--) {
          for(int j=0; j<i; j++) {
             System.out.print("*");
          }
          System.out.println();//개행 용
       }
    
    //11번 힌트는 .length() 이용해서 if/else 처리하기
    String word = "hh";
    System.out.println("문자 길이 : " + word.length());
    
    //17번 [배열]
    int[] array = {149, 180, 192, 170};
    int height = 167;
    int count = 0;
    //for-each 이용해서 풀어보기
    for(int i : array) {
       if(height < i) { //if로 키큰사람 체크하기
          ++count; //증감연산자 이용
       }
    }
    System.out.println("정답 : " + count);
    
    //18번
    String cipher = "dfjardstddetckdaccccdegk";
    int code = 4;
    String answer = ""; //최종 결과
    
    for(int i=0; i<cipher.length(); i++) { //문자길이만큼 반복문 돌리기
       if((i+1) % code == 0) { //code의 배수라면?
          answer += cipher.substring(i, i+1); //substring으로 한글자만 가져옴
       }
    }
    System.out.println("해독한 단어는 : " + answer + "입니다.");       
            
            //19번-전화번호 substring
            
            
            
            //split
           /* String[] phone = phone_number.split("");
            *String result2 = "";
            for(int t=0; i<phone.length; i++) {
            	if( i < (phone_number.length()-4)) {
            		result2 += "*";
            	}else {
            		result2 += phone[i];
            	}
              }
           System.out.println("result2 "+result2); */
            
            		/*String str = "Hello";
            		String str2 = "world";
            		
            		
            		String a = "";
            		  for(int i = 0; i<3; i++) {
            			  a = "";
            			  System.out.println(a);*/
            		
            		
            			  
       //
            			  int chicken = 100; //100마리 주문
            			  int chickenCount =  0;
            			  
            			  while(chicken >= 10) {
            				  int coupon = chicken % 10;  
            				  chickenCount += chicken / 10;
            				  chicken = coupon + chicken / 10;
            			  }
            			  System.out.println("최대 서비스 치킨 수:  " + chicken);
            			  }
            		
            		
            		
            		

               //21번
            		String my_string = "people";
            		String[] strArray = my_string.split("");
            		String result3 = "";
            		for(int i=0; i<strArray.lenght; i++ ) {
            			if(!result3.contains(strArray[i])) {
            				result3 += strArray[i];
            			}
            			
            	}
            		System.out.println("정답: "+ 정답);
            		
            		//
            		
            		int hp = 24;
            		int count2 = 0;
            		
            		count2 += hp / 5; //장군개미
            		hp %= 5;
            		
            		count += hp / 3; //병정개미
            		hp %= 3;
            		
            		count2 += hp;
            		System.out.println(count2);
            		
			}


