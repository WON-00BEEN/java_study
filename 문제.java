package javastudy_1205;

public class 문제 {

	public static void main(String[] args) {
		int money = 74900;
		
		 int 오만원 = 50000;
         int 만원 = 10000;
         int 천원 = 1000;
         int 오백원 = 500;
         int 백원 = 100;

			
			int 오만원 = money / 50000;
	         money = money % 오만원;
	         int 만원 = money / 10000;
	         money = money % 만원;
	         int 천원 = money / 1000;
	         money = money % 천원;
	         int 오백원 = money / 500;
	         money = money % 오백원;
	         int 백원 = money / 100;
	         money = money % 백원;

			
			   System.out.println("오만원 : "+ 오만원);
		       System.out.println("만원 : "+ 만원);
		       System.out.println("천원 : "+ 천원);
		       System.out.println("오백원 : "+ 오백원);
		       System.out.println("백원 : "+ 백원);

		
		// 오만원: 1장
		//만원: 2
		//천원 : 4
		//오백원 :1
		//백원 :4
		
		
		int a = 3;
		int c = 5;
		int b = (c*c)-(a*a);
		
		System.out.println(b);
		
		int[] array = {1, 3, 5};
		System.out.println(array[0]);
		
		System.out.println(array[2]);
		System.out.println(array[array.length-1]);
		
		
		// 인덱스 값 교환
		int temp = array[1]; //temp "임시공간"
		array [1] = array[2];
		array [2] = temp;
		//swap
		
		
		for(int i : array) {
			System.out.println("i :"+i);
		}
		
		
		
	}

}
