package java_study_1226;

class Book_ {
	 String title;//전역변수 or 필드변수
		
	 int price = 1000;
 
	
	 public Book_(String title, int price) { //파라미터에 있는 title과 price도 지역변수

	 this.title = title;
     this.price = price;
  }

	public void showBook () {   //지역변수 sowBook 메소드안에서만 사용
		String author = "작자미상";
		System.out.println("title : "+ title);
		System.out.println("price : "+ price);
	}
	
	 public void showAuthor() {
		 String author = "작자미상";
		 int price = 100;
		 System.out.println("author :"+ author);
		 System.out.println("title :"+ title);// 전역변수는 어디서든 사용 가능
		 System.out.println("price : " + price);
		 System.out.println("price : "+ this.price);
	   }
	 
   }
public class 복습 {

	public static void main(String[] args) {
		/*
		 * Book b = new Book();
		 * b.showAuthor();
		 */
		
		
		Book_[] bookList = new Book_[2];//Book 타입을 저장하는 배열
		
		Book_ book1 = new Book_("자바의 정석", 2000);
		bookList[0] = book1;
		bookList[1] = new Book_("파이썬의 정석", 1000);
		
		for(Book_ b : bookList)  {
			b.showBook();
		}
		
		for(int i=0; i<2; i++)  {
			bookList[i].showBook();
		}
		// 책 제목 '자바의 정석' 책의 정보를 출력
		// bookList에 저장된 책의 총 가격
	
	    if(b.title.equals("자바의 정석"))  {
		    b.showBook();
	    }
	    if("자바의 정석".equals(b.title)) {
	        b.showBook();
	      
	    }
	       priceSum += b.price;
   }
}
