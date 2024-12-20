package java_study_1219;

public class 문제 {

	public static void main(String[] args) {

//문제풀이
		/*
		 * 1. 자바에서 상속을 구현할 때 사용하는 키워드는?
		 * a)extends
		 * 
		 * 2.자바에서 모든 클래스의 최상위 클래스는?
		 * c) Object
		 * 
		 * 3.상속의 주요 장점이 아닌 것은?
		 * c) 다중 상속 지원
		 * 
		 * 4.자식 클래스가 부모 클래스의 메소드를 
		 * 재정의하는 것을 무엇이라고 하는가?
		 * 오버라이딩
		 * 
		 * 5.자바에서 클래스가 여러 클래스를 동시에 상속받는 것을 허용하는가?
		 * b)  허용하지 않는다
		 * 
		 * 6.상속을 통해 얻을 수 없는 이점은?
		 * d) 구조적 설계의 용이성
		 * 
		 * 7.상속 관계에서 자식 클래스의 객체를 생성할 때 가장 먼저 호출되는 생성자는?
		 * d) 매개변수가 없는 기본 생성자
		 * 
		 * 8.다음과 같은 Animal 클래스가 주어졌을 때, 이를 상속받는 Dog 클래스를 작성하세요. class Animal {
             public void makeSound() {
             System.out.println("The animal makes a sound");
                      }
             }
             
             
             
             
           Dog 클래스는 makeSound() 메서드를 오버라이드하여 
          "The dog barks"를 출력해야 합니다
		 * 
		 * 
		 * 
		 */
		class Animal{
		public void makeSound() {
            System.out.println("The animal makes a sound");
		    }
		}
		class Dog extends Animal {
			@Override
			   public void makeSound() {
		System.out.println("The dog barks");
	}

}

                       //9번 문제
// Car 자식클래스 , Vehicle 부모클래스
// Vehicle 기본 상속클래스는 Object
class Vehicle extends Object {
	     //protected : 동일 패키지 혹은 상속받은 클래스에서 접근 가능
	    //public : 동일 프로젝트 안에서 모든 클래스가 접근 가능
	    //private : 클래스 안에서만 접근 가능, 외부 호출 불가능(데이터 보호)
	   protected String brand = "Ford";

	 
	   public void honk() {
	      System.out.println("Tuut, tuut!");
	   }
	}

	class Car extends Vehicle {
		//private 
	   private String modelName = "Mustang";


	   
	   public Car() {
		   super(); //부모 생성자 호출
		   
		   //기본 생성자가 가장 먼저 호출됩니다
	      System.out.println("Car constructor called");
	   }

	   @Override
	   public void honk() {
	      System.out.println("Beep, beep!");
	   }

	   public void printInfo() {
	      System.out.println(brand + " " + modelName);
	      
	   }
	
		   public static void main(String[] args) {
		      Car myCar = new Car();//Car 클래스 호출
		      //Car는 Vehicle를 상속받았기 때문에 부모클래스의
		      //부모 클래스 -> 자식클래스 -> 메소드
		      myCar.honk();
		      myCar.printInfo();
		      // myCar.modelName : 필드변수 접근 불가능
		      
		      Vehicle myVehicle = new Car();
		      /*
		       * 부모클래스는 자식클래스를 대입받을 수 있음.
              * 하지만, 자식클래스에서 정의된 메소드와 필드변수는 사용할 수 없음.
		       */
		      myVehicle.honk();
		   }
		   
	}
