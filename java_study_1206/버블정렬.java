package java_study_1206;

public class 버블정렬 {

	public static void main(String[] args) {
		int[] array = {7, 4, 5, 1, 3};
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
			
			
			System.out.println("끝");
			}
		}
			
			
			
		}
	}

