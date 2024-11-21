package java_study_1121;

import java.util.Scanner;
public class 수업 {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.print("점수를 입력하세요 : ");
		  //자바는 한글지원 가능함
		  
		 int 점수 = scan.nextInt();
		 System.out.println("입력한 점수는 "+점수);
		  
		 if ( 점수 >= 80 )   {
		  
			 
			 
			 /*
		 else { 
			 
		 }
			 */
			 
			 
			//중첩 if문 
			int 점수2 = scan.nextInt();
		 if(점수2 >= 90 && 점수2 <= 100) {
			System.out.println("A등급");		
		 }else if(점수2 < 90 && 점수2 >= 80) {                           
			System.out.println("B등급"); 
		 }else if(점수2 < 80 && 점수2 >= 70) {
			System.out.println("C등급");	     
	      }else
		    System.out.println("F등급");	
          }
	     
}

