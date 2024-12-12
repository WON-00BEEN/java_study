package java_study_1212;

class Person{
	//필드변수
	String name;
	int age;
	
	Person(String name, int age) { //생성자
		/*
		 * 생성자
		 * 1: 생성자 이름과 클래스 이름은 동잏해야한다.
		 * 2: 생성자는 리턴타입이 없는 '메소드' 입니다.
		 * 3: 생성자는 파라미터 타입만 있고 기본(default) 생성자는 아무것도 받지 않는다.
		 * 
		 
		   생성자 파라미터의 역할
		   받은 삾을 필드변수에 대입
		 */
		//this는 필드변수를 의미함
		this.name = name;
		this.age = age;
		//this.x = 10; 필드변수에 x라는 변수가 없으므로 해당코드는 에러
	}
	
	//리턴 타입이 없는 메소드
	public void celebrateBirthday(String name) {
		++age;
		//메소드에서 필드변수 접근 가능
	}
}
public class 수업2 {

	public static void main(String[] args) {
		
		Person p = new Person("김철수", 20);//person 클래스 불러오기
		p.name ="김철수";
		p.age = 20;
		
		System.out.println("이름: "+p.name);
		System.out.println("나이: "+p.age);
		p.celebrateBirthday("김철수");
		//파라미터 
		System.out.println("나이: "+p.age);
		
		Person p2 = new Person("홍길동", 30);//생성자로 필드변수 초기화
		System.out.println("이름: "+p2.name);//필드변수 출력
		System.out.println("나이: "+p2.age);
	}

}
