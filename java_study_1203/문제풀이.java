package java_study_1203;

public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text = "Hello world";
		System.out.println(text.toUpperCase());
				
		
		
		  //4. 대문자로 변환
	      String text = " Hello World! ";
	      System.out.println(text.toUpperCase());
	      //5. 
	      String x = "고구마";
	      String y = "고구마";
	      if(x == y) { //문자 비교 X
	         //위에 코드는 문자를 비교하는게 아닌
	         //메모리에 저장된 주소를 비교하는 것
	         System.out.println("같습니다.");
	      }
	      if(x.equals(y)) { //문자 비교
	         System.out.println("같습니다.");
	      }
	      
	      //6.
	      String h = "흑백요리사";
	      System.out.println(h.substring(0,1));//첫 번째
	      System.out.println(h.substring(h.length()-1, h.length())); //마지막 단어
	      

		//8.
		 String word = "aabbacccaaaaa";
		 
		 String [] array = word.split("");
		 int count = 0;
		 for(int i=0; i < array.length; i++) {
			if(array[i].equals("a")) {
		            ++count;
		         }
		      }
		      System.out.println("총 : " + count);
		      

		 
		      String a = array[0];
		      System.out.println(a);
		      
		      for(String i : array) { //배열의 길이만큼 자동으로 반복한다. (for-each문)
		         //i에 자동으로 배열값이 대입됨
		         System.out.println("배열 값 : " + i);
		      }
		      

		
		 
		 //10.
		 String [] strArr = {"and", "notad", "abcd"}
		 for (String i : strArr) {
			 if(!i.contains("ad")) { //ad가 포함되어 있다면? -> 느낌표 -> ad 없다면?
		            System.out.println(i);
		         }
		         if(i.contains("ad") == true){ //잘못된 코드
		            //contains가 true 혹은 false인데, 한번 더 true를 비교할 필요는 없다.
		         }
		      }

		 
		 
		 
		 //문제 11
		 
		 String my_string = "nice to meet you";
		 String[] vow = {"a", "e", "i", "o", "u"};
		 
		 for(String i : vow) {
			 my_string = my_string.replaceAll(i, "");
		 }
		 System.out.println(my_string);
		
	
	
	     //ㅁ문제12
		 
		 String numbers = "onefourzerosixseven";
		 String[]matchNumbers = {"zero", "one", "two", "three", "four", "five", "six","seven",
                          "eight", "nine"};
		 
		 for(int i=0; i<matchNumbers.length; i++) {
	         //3.replaceAll로 특정 단어 숫자로 교체
			//Integer.toString : 숫자에서 -> 문자로 변환
	         numbers = numbers.replaceAll(matchNumbers[i], Integer.toString(i));
	      }
		 System.out.println("정답: "+numbers);
		 }
	}
		 
