package java_study_1206;

public class 정렬문제 {

	public static void main(String[] args) {
		
		
		//문제: 버블정렬을 이용해서 아래 배열을 오름차순으로 정렬하시오.
		// 디버깅을 하면서 확인하기.
		
		 int[] array = {10, 4, 3, 29, 31};
		 for(int i=0; i<array.length-1; i++) {
				System.out.println("i의 값:"+1);
				
			for(int j=0; j<array.length-i; j++) {
				int x = array[j];
				int y = array[j+1];
				if( x > y) {
					//swap
					int temp = x;
					array[j] = y;
					array[j+1] = temp;
				}
				
				
		  System.out.println("오름차순으로 정렬");
		
		
			}
		 }
		
		
		
		
		
		
	}

}
