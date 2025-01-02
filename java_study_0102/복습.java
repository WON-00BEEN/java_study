package java_study_0102;

import java.util.ArrayList;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
      * 
      *    
      *    
      *    
      *    
      *    
      *    
      *    
      *    
      *    ArrayList 큰 특징
      *    1. 일반 배열과 다르게 사ㄹ이즈를 선언할 필요가 없다
      *    2. 클래스 타입만 추가할 수 있음
      *    (int, double,boolean (x))
      *    
      *    
      *    
      */
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		ArrayList<Integer> list = new ArrayList<>();// 정수형을 저장
		
		//항목추가
		shoppingList.add("우유");
		shoppingList.add("계란");
		shoppingList.add("빵");
		
		
		System.out.println("장바구니 내용 :"+ shoppingList);
		
		  for(String s : shoppingList) {
			System.out.println("장바구니 내용 :"+ s);
		}
		
		 shoppingList.add(1, "치즈");
		 
		 System.out.println("장바구니 내용 :" + shoppingList);
		 
		 System.out.println("장바구니에 담긴 항복 수: " + shoppingList.size());
		 
		 
		 if(shoppingList.contains("빵"))  {
			 System.out.println("빵은 장바구니에 있습니다.");
		 }else {
			 System.out.println("빵은 장바구니에 없습니다.");
		 }
		 
		 
		 //특정 항목 제거
	      shoppingList.remove("계란"); //장바구니에서 특정 물건을 빼내는 것과 같다.
	      //최종 장바구니 내용 출력
	      System.out.println("최종 장바구니 : " + shoppingList);
	      

		 
		 
	}

}
