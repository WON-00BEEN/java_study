package java_study_1203;

public class 복습 {

	public static void main(String[] args) {
		
		
		// 1부터 100까지 숫자중에서 짝수만 출력
		
		for( int i = 1; (i<=100) ; i++){

			//for 코드를 통해 1부터 100까지 출력하는 문장 작성

			      if(i % 2 == 0) {
            //코드가 한 줄 일때 중괄호 생략가능
			//for  이용해서 짝수만 출력

			      System.out.println(i);

			      }

			    }
           
		
		   
		
	
			 int sum = 0;      
			 for(int i =1; i<=10; i++) {
				 sum =sum+i;
				 sum +=i;
			 }
              System.out.println(sum);
         }
	
	
	
	       String [] array = {"apple", "apple", "apple", "banana"};
	       int count = 0;
	       for(String i : array) {
	    	   if(i.equals("apple")) {
	    		   ++count;
	    	   }
	       
	       }
	       
	       System.out.println(count++);
	    	   
	       
	       
	       
	       
	       
	       *
	       */
	       double price = 580000;
	       if(price >= 500000)  {
	    	price = price *0.8;
	    }else if(price >= 300000) {
	    	price = price *0.9;
        }else if(price >= 100000)
        	price = price *0.95;
        }
   
/*
           *my_stringdp "hello"
           *my_string에 들어있는 각 문자를 n만큼 반복한다
           *n에 3을 대입

*/
            
            
            int n = 3;
            
            
            String my_string = "hello";
            int n = 3;
            
            String result = "";
            
            for(int i= 0; i < my_string.length(); i++){
             String word = my_string.substring(i, i+1);
             for(int j=0; j<n; j++) {
            }
            return += word;
          
            System.out.println("결과 :" + result)
			}
        }
    }
            
            
            // result : hhheeellllllooo

    
            String s = "Hello";
            System.out.println(s.repeat(3));
            
            String[] strArray = my_string.split("");
            String result2 = "";
            for(String i : strArray) {
            	result2 += i.repeat(n);
            }
            System.out.println(result2);
         
    
    
    
    
            
            //[배열] 짝수, 홀수 개수구하기
            /*
             * 정수형 배열 num_list가 주어질 때
             * 
             */
    
            int[] num_list = {1, 3, 5, 7};
            int[] answer_list = new int[2];
            
            int 홀수카운트 = 0;
            int 짝수카운트 = 0;
            for(int i : num_list) {
            	if(i % 2 == 0) {
            		++짝수카운트;
            		answer_list[0] = 짝수카운트
            	}else
            		++홀수카운트;
            	    answer_list[1] = gh홀수카운트
            }
         }     
    
           //문제
         /*
          * 상원이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 
            양꼬치는 1인분에 12,000원, 
            음료수는 2,000원입니다. 
            정수 n과 k가 변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 
            총얼마를 지불해야 하는지 출력하시오.
          */
         int lambskewersPrice = 12000;//양꼬치 가격
         int drinkPrice = 2000; //음료가격
         int n1 = 64; // 총 양꼬치 
         int k = 6; // 총 음료
         

 		
 		int final_price = 0; //마지막가격?
 		
 		final_price = n1 * lambSkewersPrice;
 		final_price += k * drinkPrice;
 		
 		if ((n1 >= 10) && (k >= 1))
 	    final_price -= (n1 / 10) * drinkPrice;
 		
 		System.out.println("마지막 가격 : " + final_price);
      }
        	        
         return (lambskewersPrice+drinkPrice);
        }
     }
                    
    
    
