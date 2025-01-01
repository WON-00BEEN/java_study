package java_study_1231;

import java.util.Scanner;

class A{ //A클래스 선언
	private int x; //전역변수 선언
	private int y;
	
	public int getX() { //get : 전역변수 리턴
	    return x;
	}
	public void setX(int x) { //set : 전역변수 값 초기화
	    this.x = x;
	}
	public int getY() {
	    return y;
	}
	public void setY(int y) {
	    this.y = y;
	 }

}

public class 복습 {

	public static void main(String[] args) {
		
		//플래그값 => true or false
		boolean isflag = false;
		
		String inputWord = "사과";
		
		if(inputWord.equals("사과")) {
			isflag = true;
			
		}
		if(isflag) {
			
			System.out.println("플래그 값 변경");
		}
		
		String book[] = {"책1", "책2", "책3"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("찾을 책을 입력하세요 :");
		String search = scan.next();
		
		for(String s : book) {
			if(s.equals(search)) {
				isflag = true;
				
			}
		}
		
		if(!isflag) {
			System.out.println();
		}
		
		A a = new A();
		a.setX(10);
		System.out.println(a.getX());
		
		A []array = new A[5];
		array[0] = a;
		array[0].getX();
		
		A b = new A();
		b.setX(20);
		array[1] = b;
		
		A c = new A();
		c.setX(30);
		array[2] = c;
		
		int sum = 0;
		for(A i : array) {
			sum += i.getX();
			
		}
		System.out.println("chdgkq:" +sum);
	}

}
