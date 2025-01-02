package java_study_0102;

import java.util.ArrayList;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
		
	}
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
}
public class 복습2 {

	public static void main(String[] args) {
		
		
		ArrayList<Book> Library = new ArrayList<>();
		
		Book b = new Book("자바의 정석","남궁성");
		
		//도서관 책
		Library.add(b);
		Library.add(new Book("데이터 구조와 알고리즘","홍길동"));
		Library.add(new Book("AI","박길동"));
		
		//for-each
		for(Book book : Library) {
			
			System.out.println("제목 :" + book.getTitle()+", 저자 :"+book.getAuthor());
		
		}
		
		System.out.println("도서관에 있는 책의 수: "+Library.size());
		
		
		Book book2 = Library.get(1);
		System.out.println("책 이름: "+book2.getTitle());
		
		//퀴즈 0qjs번째 요소 삭제후 사이즈 출력하시오
		Library.remove(0);
		
		
		
		
		
		
		
		
		}
		
		
	}

