package java_study_1217;



class 식당{
	  String 식당이름;
	  String 음식타입;
	  
	  /*
	   * 메소드 이름은 동일하지만
	   * 
	   * 
	   */
	  
	  
	   public 식당() {
		   
	   }
	   public 식당(String 식당이름, String 음식타입) {
		   
		   this.식당이름 = 식당이름;
		   this.음식타입 = 음식타입;
		   
	   }
	
	      //출력용 메소드 만들어보기
	   public void 식당이름출력하다() {
		   
		      System.out.println("식당명 : " + this.식당이름);
		      System.out.println("타입: "+this.음식타입);
	   }
	
}
public class 복습2 {

          public static void main(String[] args) {
        	  
        	  식당 a = new 식당();//기본 생성자 선택
              a.식당이름 = "스바라시봉명점";
              a.음식타입 = "일식";
              //System.out.println(a.식당이름);
              //System.out.println(a.음식타입);
              a.식당이름출력하다();
              
              식당 b = new 식당("맛찬들","한식");//파라미터가 있는 생성자 선택
              //System.out.println(b.식당이름);
              //System.out.println(b.음식타입);
              b.식당이름출력하다();
              /*
               * 메소드
               * 1. 코드량 줄이기 가능
               * 2. 코드 재사용성 증가
               * 3. 코드 유지보수 & 협업 능률 증가
               */

        	  
          }
              
  } 
