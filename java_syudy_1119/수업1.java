package java_syudy_1119;

public class 수업1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean 비교 = 3 < 5;
        System.out.println();
        boolean 비교2 = 4 > 10;
		System.out.println();
        boolean 비교3 = 5 == 5;
        System.out.println();
        boolean 비교4 = 5 != 7;
	
        
        		
        		
        
        //논리연산자
        boolean 배가고프다 = true;
        boolean 돈이있다 = true;
        boolean 식당에갈수있다	= 배가고프다 && 돈이있다;
        System.out.println("식당에 갈 수 있다: "+식당에갈수있다);
        		
        
        
        //or 연산자 
        boolean 비가온다 = true;
        boolean 우산이있다 = false;
        boolean 외출가능 = 비가온다 || 우산이있다;
        System.out.println("외풀가능 :"+외출가능);
        
        
        //not 연산자
        boolean 햇빛이쨍쨍 = true;
        boolean 흐린날씨 = !햇빛이쨍쨍;
	    System.out.println("햇빛이 쩅쨍" + 흐린날씨);
	
	
	  //
	    int a = 10;
	    int b = 20;
	    a += b;
	    
	    int c = 5;
	    int d = 6;
	    c = c * d;
	    System.out.println("c의 값은 :"+c);
	    //c* = d;
	    
	    
	    int 증감 = 0;
	    증감++;
	    System.out.println("증감: " +증감);
	    증감++;
	    System.out.println("증감: " +증감);
	    
	    int 사과 = 100;
	    System.out.println(++사과);
	    System.out.println(사과);
	    
	    int 바나나 = 100;
	    System.out.println(바나나++);
	    System.out.println(바나나);
	    
	    
	    int num = 3;
	    int num2 = 5;
	    int 결과 = num > num2 ? num-num2 : num+num2;
	    
	    System.out.println("결과 :"+결과);
	    
	    
	    
	    double weight = 70.5;
	    double height = 1.77;
	    double bmi = weight  / (height*height)
	    		System.out.println("bmi :"+bmi);
	    
	    
	    
	    final double PI = 3.14
	              double radius = 5.0; //원의 반지름
	              
	              
	              double cicle = (3.14 * 5.0 *5.0);
	}
	
}













