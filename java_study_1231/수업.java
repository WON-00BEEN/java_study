package java_study_1231;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 수업 {

	public static void main(String[] args) {
		
		//***제네릭과 컬렉션즈(=배열)
		// 배열기초 -> 객체배열 -> 제네릭과 컬렉션즈
		
		
		/*
		 * 배열처럼 데이터를 저장함
		 * 빠른 접근 속도와 '동적 크기' 조절이 가능함 장점이 있음.
		 */
		
	     int [] array = new int[6];
	     array[0] = 10;
	     array[5] = 7;
	     array[6] = 5; //에러발생
		
		
		ArrayList<Integer> list =new ArrayList<Integer>(); 
		
		/*
		 * wpspflr제네릭(< >)특징
		 * 클래스 타입만 넣을 수 있음
		 * int 형을 답고 싶으면 int에 클래스타입
		 * 
		 * 
		 */
		
		list.add(10);
		list.add(5);
		list.add(34);
		
		int num1 = list.get(0);
		System.out.println("조회 :"+ num1);
		
		/*
		 * 1번째와 2번째에 저장죈 값도 조회
		 */
		
		int num2 = list.get(1);
		System.out.println("조회 :"+ num2);
		
		int num3 = list.get(2);
		System.out.println("조회 :"+ num3);
		
		//list 사이즈 조회
		System.out.println("사이즈 조회: "+ list.size());
		list.add(5);
		System.out.println("사이즈 조회: "+ list.size());
		
		//제거
		list.remove(0);
		System.out.println("0번째 요소 조회:"+ list.get(0));
		System.out.println("사이즈 조회: "+ list.size());
		
		
		//수정 (set, remove)
		list.set(0, 100);
		System.out.println("0번째 요소 조회:"+ list.get(0));
		
		
		for(int i : list) {
			System.out.println("저장된 값은 :" + i);
		}
		
		//
		list.add(40);
		  int sum = 0; //총합
		  int avg = 0; //평균
	      for(int i : list) {
	         sum += i;
	      }

		System.out.println("list에 저장된 총합: "+ sum);
		System.out.println("list 평균: "+sum / list.size());
		
		//HashSet: wndqhrwprj
		//중복 제거rk가 필요하거나 집합 연산을 수행할 때 사용함
		
		
		HashSet<Integer>set = new HashSet<Integer>();	
		
		set.add(10);
		set.add(20);
		set.add(10);
		
		System.out.println("HashSet 크기"+set.size());
		
		//HashSet은 특정요소 조회불가능
		
		set.contains(10); //내부에 값이 존재하는지 판단가능
		
		set.remove(0); //0번째 요소 삭제
		
		
		//HashMap
		/*
		 * 사전에서 단어를 찾으면 그에 해당하는
		 * 뜻이나 풀이가 나오는 것 처럼 키를 사용해서 값을
		 * 저장하고 검색하는 자료구조.
		 */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();		
		/*
		 * 1. 데이터는 항상 키와 값의 쌍으로 저장한다
		 * 2. 각 키는 중복될 수 없지만, 값은 중복될 수 있다
		 * 3. 키를 사용해 값을 조회한다.
		 * 4. 데이터의 순서를 보장하지 않는다.
		 */
		
		map.put("사과", 500);
		map.put("포도", 800);
		
		
		int price = map.get("포도");
		System.out.println("vheh포도값은 :"+ price);
		
		map.remove("사과");
		
		
		boolean hasBanana = map.containsKey("바나나");
		System.out.println("바나나 있어요? " + hasBanana);
		
		//keySet으로 모든 키를 가져온 후, 각 키에 해당하는 get() 메소드로 값을 얻을 수 있음.
	      for(String key : map.keySet()) {
	         System.out.println("키 : " + key);
	         System.out.println("값 : " + map.get(key));
	   }
	      

	}

}
