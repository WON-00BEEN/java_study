package library2;

class A {
	public A() {
		super();
		System.out.println("A 생성자");
	}
	
	
class B {
	public B() {
		super();
		System.out.println("B 생성자");
	}
}
	
class C extends B{
	public C() {
		super();
		System.out.println("C 생성자");
	}
}
public class 라이브러리서비스 {
	public static void main(String[] args) {
		
		 C c = new C();
	   }
	}
