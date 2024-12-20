package java_study_1219;
/*
 *  상속(다형성)
 */

class x {
	
	int money; //필드변수
	
	public x (int money) {
		this.money = money;
	}
	public void showMeTheMoney() {
		  System.out.println("my money :  "+ this.money + "$");
	}
}
// extends  : 상속하다
class Y extends X { //Y클래스가 X클래스를 상속받다.
	   //Y클래스는 X클래스의 필드변수와 메소드를 사용할 수 있다.

	 //부모클래스에서 기본생성자를 수정했다면
	//자식클래스 생성자에서 부모클래스를 생성자 무조건 호출해야한다
	public void showMeTheMoney() {
		  System.out.println("my money :  "+ 100000000 + "$");
	}
}
class Y extends X{
		 //Y클래스는 X클래스의  메소드를 사용할 수 있다.
	   int myMoney = 1000;

	
	     public Y() {
	    	 super(40000);
	    	 
	     }
	
	   public int getMyMoney() {
		   return this.myMoney;
	   }
	
	@Override //부모클래스에 정의된 메소드 '재정의(오버라이딩)'
	public void showMeTheMoney() {
	      System.out.println("my(Y) money : " + 900000 + "$");
	   }

	
	public void showMessage () {
		System.out.println("안녕하세요, Y입니다.");
	}
}


public class 복습2 {

	public static void main(String[] args) {
		
		 X x = new X(20000); // X클래스 호출(객체 생성 or 인스턴스화)
	     x.showMeTheMoney();
	     //X는 showMessage가 없음 

		
		Y y = new Y ();
		y.showMeTheMoney( );
		y.showMessage();
		
		int result = y.getMyMoney(); //리턴타입이 있는 메소드 호출
		//result라는 변수에 getMyMoney 최종값을 리턴받음
		System.out.println("result : "+result);
	}

}
