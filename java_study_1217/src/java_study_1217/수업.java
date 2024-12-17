package java_study_1217;

class 계산기 {
	
	         public int sum(int x, int y)  {
	        	 return x + y;
    }
}


class 계산기2 {
	
           public int sum(int x, int y)  {
   	       return x + y;
    }
    
          public int minus(int x, int y) {
        	  return x - y;
          }
    
}

// ******extends : 상속
/*
 * 
 * (자식클래스 == subClass)
 * 계산기(qnahzm부모클래스  == superClass)
 */



class 계산기3 extends 계산기{
	 
	    //부모클래스에 있는 베소드 가져오기
	//@Override : 오버라이딩 (부모클래스 메소드 **********)
	/*
	 *  오버로딩 : 메소드 이름은 중복 허용하기(파라미터 타입 다르게 지정)
	 *  오버라이딩 : 부모클래스에 정의된 메소드를 자식클래스에서 호출.
	 */
	    @Override
	    public int sum(int x, int y) {
	           // TODO Auto-generated method stub
	           return super.sum(x, y);
	    }
	    
	    
	    

	
	     public int minus(int x, int y) {
	    	 return x -y;
	     }
}

public class 수업 {

	public static void main(String[] args) {
		
		계산기 계산기1 = new 계산기();
		int result = 계산기1.sum(10, 10);
		System.out.println("결과 : "+ result);
		
		    //빼기와 더하기 기능이 있는 클래스
		/*
		 *  자바는 무료 오픈소스 -내장클래스를 확인할 수 있음
		 */
             Scanner scan = new scanner(System.in);
             
             
             
             계산기3 계산기3 = new 계산기3();
             계산기3.sum(10, 20);
	}

}
