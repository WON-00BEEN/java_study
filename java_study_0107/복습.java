package java_study_0107;

import java.util.ArrayList;

class Book {
	private String title;
	private String author;

    public Book(String title, String author) {
    this.title = title;
    this.author = author;
 }  
public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		//자바 마지막 수업
		
		ArrayList<Book> bookLst = new ArrayList<>();//임포트
		
		
		//Book 추가
		bookList.add(new Book("A도서", "홍길동"));
		
		Book book = new Book ("B도서", "김길동");
		bookList.add(book);
		
		//Book 조회
		for(Book b: bppkList) {
			System.out.println("제목: "+b.getTitle() +", "+"저자: " +b.getTitle());
			
			
			
		}
		
		Book book1 = bookList.get(1);
		System.out.println("제목: "+b.getTitle() +", "+"저자: " +b.getTitle());
		
		//List 사이즈 조회
		System.out.println("길이: "+ bookList.size());

		
		/*
		 * rh공부순서
		 * 
		 * 배열 -> 객체배열 -> 제네릭과 컬렉션즈 -> 콘솔 프로젝트
		 * 
		 */
		
		
		
		
	}

}
