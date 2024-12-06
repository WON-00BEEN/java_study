package java_study_1206;

public class 질문 {

	public static void main(String[] args) {
         //문제24 그리드알고리즘
		int hp = 24;
		int count2 = 0;
		
		count2 += hp / 5; //장군개미
		hp %= 5;
		
		count2 += hp / 3; //병정개미
		hp %= 3;
		
		count2 += hp;
		System.out.println(count2);
	}

}
