package java_study1210;

//클래스 이름 : 수업
//클래스 이름은 대문자로 입력
// 필드, 생성자, 메소드 접근 지정자 public
public class 수업 {
	
	
	int x = 10; //필드변수(전역변수)

	
	public int getX() {
		return x;
	}
	
	
	
	
	
	public static void main(String[] args) {
		 // 객체지향 : 
         //지금까지는 main 메소드 안에 작성함
		
		//붕어빵 클래스를 호출
		//new : 클래스 호출
		붕어빵 x = new 붕어빵();
				x.붕어빵종류 = "팥";
				x.붕어빵가격 = 500;
				//. : 접근하다
				System.out.println("붕어빵종류: "+ x.붕어빵종류);
				System.out.println("붕어빵가격: "+ x.붕어빵가격);
		
		     /*
		      * 메소드안에 작성된 변수는 '지역변수'
		      * 
		      * 
		      * 필드변수는 초기화를 하지않아도 된다.
		      * 자동으로 초기화 실행
		      * 
		      */
				
				int num=0;
				System.out.println(num);
		
		
		      붕어빵 y = new 붕어빵();
		
		      System.out.println("붕어빵종류: "+ y.붕어빵종류);
		      System.out.println("붕어빵가격: "+ y.붕어빵가격);
		
		      
		       //필드변수 : 초기화옵션
		      //메소드안에 초기화 핑수
	}

}
