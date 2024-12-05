package javastudy_1205;

public class 기초문제 {

	public static void main(String[] args) {
		// 1 -3번 상수
		// 
		
		
		// 2
		
		//3  -4번
		
		//4  1부터 100까지의 숫자 중 짝수인지 홀수인지 판별하는 프로그램을 작성해주세요
		
		  if (num % 2 == 1) {            
			  System.out.println("홀수");  } 
	else {    System.out.println("짝수");  }      
		     }
	}
		
		//5
		
		
		//6
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		for (int j = 1; j <= 100; j++) {
			if(j%3 ==0) {
				sum += j;
			}
		}
		System.out.println("1~100까지 3의 배수 합 = " + sum);

		//7
		 int n = 15;// 인원
	       int slice = 7; // 7조각
	       int pizzaCount = 0; //피자 수
	       
	       pizzaCount = n / slice; //나머지 값이 존재함
	       System.out.println("pizza count : " + pizzaCount);
	       
	       if(n % slice != 0) { //나머지 값이 존재한다면? if 실행
	          ++pizzaCount; //증감연산자 이용해서 피자 한판 추가~!
	       }
	       System.out.println("pizza count : " + pizzaCount);

		
		
		//8
		//사용자로부터 정수를 입력받아 팩토리얼을 계산하는 
		//프로그램을 작성하세요. (예: 5! = 5 * 4 * 3 * 2 * 1)
          
	       
	       
		//9
	    //2부터 5까지의 구구단을 출력하는 프로그램을 작성하세요.
	       int 구구단 = 2;
	       for(int i=1; i<=5; i++) {
	          System.out.println(구구단+"*"+i+"="+구구단*i);
	       }
	       

	       
		
		//10 
		//****
		//***
		//**
		//*
		for (int i = 1; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//11
		
		
		//12-4
		
		
		
		//13
		
		
		
		//14
		
		
		
		
		//15   문자열 "Java Programming"에서 'a'의 개수 코드를 작성하세요.
		String word = "Java programing";
	      String[] array = word.split("");
	      int count = 0;
	      for(int i=0; i<array.length; i++) {//일반 for
	         if(array[i].equals("a")) {
	            ++count;
	         }
	      }
	      
	      System.out.println(" a의 개수 " + count);

		//16
	      //아이스 아메리카노는 한잔에 5,500원입니다. money가 변수로 주어질 때, 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 출력하시오.
	      //int money = 15000;
	      //예) 15000원이면 커피 2잔과 4000원이 남습니다.

		
	      
	      
	    //17
	      //길동는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 길동이네 반 친구들의 키가 담긴 정수 배열 array와 길동이의 키 height가 
	      //변수로 주어질 때, 길동이보다 키 큰 사람 수를 출력하시오.
	      int[] array1 = {149, 180, 192, 170};
	      int height = 167;
		
	      
		//18
		
		//19
	      //전화번호 문자열 phone_number로 주어졌을 때, 
	      //전화번호의 뒷 4자리를 제외한 나머지 숫자를 
	      //전부 *으로 가린 문자열을 출력하는 프로그램을 완성해주세요. 
	     // String phone_number = "0171238888";
	     // String phone_number = "017123@8888";
	     // String[] result = phone_number.split("@"); 
	      
	      String phone_number = "0171238888";
	      String start = phone_number.substring(phone_number.length()-4, phone.length());
			
		  System.out.println(start);
	      //  답: 8888
	     

	      //     “0171238888” ******8888
		
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
