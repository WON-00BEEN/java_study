package java_study_1128;

public class answkduf {

	public static void main(String[] args) {
	}
	

	String[] email = {"123@naver.com", "456@gmail.com", "789@naver.com"};

			
	for(int i=0; i<email.length; i++) {
	    String e = email[i];
		System.out.println("이메일 주소 : " + e);
		if(e.contains("naver.com")) {
	    System.out.println("네이버 이메일 : " + e);

		}
	}
	//split을 활용하여 특정 문자
     String food = " 돈까스@돈까스@라면@김밥@돈까스 ";
	 String[] foodArray = food.split("@"); //@기준으로 문자 나누기
     int count = 0;
     for(int i=0; i<foodArray.length; i++) {
        if(foodArray[i].equals("돈까스")) { //돈까스랑 비교
           ++count;
        }
     }
     System.out.println("돈까스 개수는 : " + count);
  }
}

		
		
		
		
		
