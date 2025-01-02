package LibrarayService;

import java.util.ArrayList;

import library.Book;

public interface library {
  void addBook(Book book);
  void searchBook(String keyword);
  void removeBook(String isbn); //도서 삭제
  ArrayList<Book> getAllBooks(); //도서 전체 조회
}