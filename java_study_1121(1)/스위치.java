package java_study_1121;

import java.util.Scanner;
public class 스위치 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char grade = 'a';
		switch(grade) {
		case'a' :
			System.out.println("a학점 입니다");
			break;
		case'b' :
			System.out.println("b학점 입니다");
			break;
		case'c' :
			System.out.println("잘못된 학점입니다.");
		}
		
		
		//answp 1~5까지의 숫자를 입력받아 해당하는 과일 출력
		//1-사과 2-바나나 3-오랜지 4-포도 5-복숭아
		
		Scanner scan = new Scanner(System.in);
	      System.out.print("1 ~ 5 사이 번호를 입력하세요 : ");
	      int num = scan.nextInt();
	      
	      switch(num) {
	         case 1 :
	            System.out.println("사과");
	            break; //브레이크는 switch에서만 작성하는게 아님.
	         case 2:
	            System.out.println("바나나");
	            break; 
	         case 3:
	            System.out.println("오렌지");
	            break; 
	         case 4:
	            System.out.println("포도");
	            break; 
	         case 5: 
	            System.out.println("복숭아");
	            break; 
	      }
	}
	
}

