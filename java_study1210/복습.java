package java_study1210;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 사칙연산
		//2. 대입연산자
		//3. 증감연산자
		
		   int x = 10; //초기 선언식
		      x = 30;
		      System.out.println("x의 최종 값은 ? " + x);
		      
		      String s = "123";
		      String s2 = "456";
		      String result = s + s2; //문자가 합쳐짐
		      System.out.println("결과 : " + result);
		      
		      int num = Integer.parseInt(result); // 문자가 숫자로 변환
		      System.out.println("결과 : " + num);
		      
		      int count = 0;
		      ++count; //1씩 증가됨
		      count++;
		      ++count;
		      System.out.println("결과 : " + count);
		      
		      //제어문
		      /*
		       * if문 -> 95%
		       * switch문 -> 5%
		       * 
		       * 조건문? : 특정 조건을 평가하여 그 결과에 따른 다른 코드를 실행한다.
		       * 
		       * if(조건식){ <= true or false
		       *     //코드 작성(조건이 참(true)일 때 실행할 코드)
		       * }
		       * 
		       * if-else문 : 조건이 참일 때와 거짓일 때 각각 다른 코드를 실행
		       * if(조건식){
		       *    
		       * }else{ 
		       *   //조건이 거짓(false)일 때 실행할 코드
		       * }
		       * 
		       * else-if문 : 여러 개의 조건을 평가
		       * if(조건식1){
		       *   //조건식1이 참일 때 실행
		       * }else if(조건식2){
		       *   //조건식2이 참일 때 실행
		       * }else if(조건식3){
		       *   //조건식3이 참일 때 실행
		       * }else{
		       *     //모든조건이 거짓일 때 실행할 코드
		       * }
		       */
		      
		      //무엇이 출력되고 그 이유는 무엇인지 작성하기
		      //=> 답) 출력 A, !(부정)연산자 때문에 false가 true로 변함
		      boolean isData = false; //bool타입 변수는 앞에 'is' 먼저 시작합니다.(규칙)
		      if(!isData) {
		         System.out.println("출력 A");
		      }else {
		         System.out.println("출력 B");
		      }
		      
		      //두 비밀번호 비교하기
		      String password = "123"; //비밀번호
		      String rePassword = "456"; //비밀번호 재입력
		      // '==' : 비교연산자
		      //자바에서는 문자를 비교할땐 비교연산자가 아니라 equals(동등한) 를 사용합니다.
		      if(password.equals(rePassword)) { //문자열 함수로 문자를 비교한다.
		         System.out.println("비밀번호가 일치합니다.");
		      }
		      //아래에 비밀번호가 일치하지 않다를 if로 나타내보시오.
		      // '!=' : 일치 x 연산자
		      if(!password.equals(rePassword)) {
		         System.out.println("비밀번호가 일치하지 않습니다.");
		      }
		       
		      if(10 != 5) {//10하고 5가 다르다면?
		         System.out.println("A 출력");
		      }else {
		         System.out.println("B 출력");
		      }
		
		/*
		 * if문
		 * switch문
		 * 
		 * 
		 * 
		 * if(조건식) {   <=true or false
		 *     //코드 작성
		 *     }
		 *     
		 *     if - else
		 *     if(조건식){
		 *     
		 *     }else}
		 *     //whrjsdl조건이 false일 때
		 *     
		 *     }
		 *     
		 *     else-if
		 *     if(조건식){
		 *     
		 *     }else if (조건식2){
		 *     
		 *     }else if (조건식3){
		 *     
		 *     }
		 *     		 
		 */
	
		 
		 
		 
		 
		 /*
		  * 
		  * 반복문: 특정 블록의 코드를 여러 번 반복해서 ㅅㄹ행
		  * FOR : 반복 홧수가 정해져 있을 때 사용
		  * WHILE :조건이 참인 동안 반복실행
		  * 
		  * 
		  * for(초기화(1); 조건식(3); 증감식(4))
		  * 
		  * 
		  * 
		  * while
		  * 
		  * 
		  */
		 //1부터 10까지의 숫자를 출력
	      for(int i=1; i<=10; i++) {
	         //1부터 10까지 숫자 중 짝수만 출력
	         //System.out.println(i);
	         if(i % 2 == 0) { //2로 나눠서 나머지가 0이라면? (짝수)
	            System.out.println("짝수 : "+i);
	         }
	      }

		     int [] array = {1,2,3,4}; //첫번째 방법
	         int [] array2 = new int[4]; //두번째 방법
			 
			 System.out.println("0번 index: "+array[0]+"요소(아이템)");
			 System.out.println("1번 index: "+array[1]+"요소(아이템)";
			 System.out.println("2번 index: "+array[2]+"요소(아이템)";
			 System.out.println("3번 index: "+array[3]+"요소(아이템)";
			 
			 
			  for(int i=0; i<array.length; i++) {
			         System.out.println(i+"번 index : "+array[i]+"요소(아이템)");
			      }

		 
		 //배열 요소 값 변경하기
		 System.out.println("2번 index :"+array[2]+"요소");
		 array[2] = 50; //2번째 요소에 50값 대입 (기존에 값은 없어짐)
	      System.out.println("2번 index : "+array[2]+"요소(아이템)");

		 
		 
		 int []score = {50,70,100,100,90};
		 int myScore = 77;
		 int scoreCount = 0;
		 
		 for(int i=0; i<score.length; i++) {
			 int temp =score[i];
			 System.out.println("배열에서 가져온 점수:"+temp);
			 if(temp > myScore) {
				 ++scoreCount;
			 }
		 }
		 System.out.println("최종 값:" + scoreCount);
		 
		 int[] numbers = {12, 45, 7, 23, 56, 89, 34};
		 int max = 0;
		 
		 for(int i=0; i<numbers.length; i++) {
			 int temp = numbers[i];
			 if(temp > max) {
				 max = temp;
			 }
		 }
		 System.out.println("가장 큰 값은: "+ max +"입니다.");
			 }
		 
		 
		 String[] nickNames = {"사과", "바나나", "오랜지", "포도", "키위"};
		 String userNickName = "사과";
		 
		 boolean isFlag = false; //플래그(flag, 깃발)값 (0아니면 1을 의미함)
	       for(int i=0; i<nickNames.length; i++) {
	          String temp = nickNames[i]; //배열 요소 temp에 대입
	          if(temp.equals(userNickName)) { //동일하다면?
	             isFlag = true;
	          }
	       }

		
		 
		 if(isFlag) {
			 System.out.println("닉네임이 중복됩니다.");
		 
		 
		 
			 int[] numbers2 = {5, 10, 15, 20, 25};
		       int sum = 0;
		       for(int i : numbers2) { //for each
		          System.out.println("배열 요소 출력 : " + i);
		          sum += i; //요소 총합 구하기
		       }
		       System.out.println("요소 총합  : " + sum);
		       
          }
    }
}