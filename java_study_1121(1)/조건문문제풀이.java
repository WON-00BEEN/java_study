package java_study_1121;

import java.util.Scanner;
public class 조건문문제풀이 {

	public static void main(String[] args) {
		
		
		 int x = 15;
	      // == : 같다, % : 나머지
	     
	      
	      if( x % 3 == 0)  System.out.println("3의 배수입니다.");
	      else System.out.println("아닙니다.");
	      
	      
	      //문제2. 변수 y가 5의 배수인지 판단하는 프로그램 작성하기
	      int y = 5;
	      if( y % 5 == 0) {
	         System.out.println("5의 배수가 맞습니다");
	      }else {
	         
	      }
	      
	      //문제3. 두 정수를 입력받아 큰 수 출력하기
	      Scanner scan = new Scanner(System.in);
	      System.out.print("a의 값을 입력하세요 :" );
	      int a = scan.nextInt();
	      System.out.print("b의 값을 입력하세요 :" );
	      int b = scan.nextInt();
	            
	      if(a > b) {
	         System.out.println("a 값이 더 크다"  );
	      }else if(a < b) {
	         System.out.println("b 값이 더 크다." );
	      }else {
	         System.out.println("값이 동일합니다." );
	      }
	      
	      
	      //문제4. 짝수 구하기
	      int 짝수 = 4;
	      if(짝수 % 2 == 0) { //짝수라면?
	         System.out.println("짝수");
	      }else {//짝수가 아니라면?
	         System.out.println("홀수");
	      }
	      //문제 5. 홀수 구하기
	      int 홀수 = 9;
	      if(홀수 % 2 != 0) {
	         
	    	  
	    	  
	    	  
	      //문제 6. 3과 5의 공배수 판단
	      //공배수란 해당 숫자가 3의 배수, 5의 배수
	      int number = 15;
	      if(number % 3 == 0 && number % 5 == 0) {
	         System.out.println(number+"는 공배수입니다.");
	   }

	}	
		
		
		
		
		
		