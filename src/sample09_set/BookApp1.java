package sample09_set;

import java.util.HashSet;

import sample08_list.Book;

public class BookApp1 {
	
	public static void main(String[] args) {
	
		HashSet<Book> books = new HashSet<>();
		
		// List객체에 Book객체 저장하기
		// 동일한 책번호를 가진 책정보는 같은 객체로 보고 저장되지 않게 하자.
		// Book 클래스에서 hashCode()와 equals(Object o) 메소드를 재정의한다.
		// 원래 Set의 자료구조는 객체간 해시코드 값을 기준으로 중복되는 객체는 제외하는 기능있다. 
		// 하지만 클래스의 해시코드와 이퀄즈 메소드 재정의를 해주지 않으면, 객체가 가지고 있는 멤버 값이 같아도
		// 해시코드 값은 서로 다르기 때문에 중복으로 취급하지 않는다.
		// 따라서 String과 Warpper객체(기본자료형)외의 객체를 만들어 Set을 사용할 때는 메소드 재정의를 해줘야한다.
		books.add(new Book(100, "자바의 정석", "남중성", 35000));
		books.add(new Book(100, "자바의 정석", "남중성", 35000));
		books.add(new Book(100, "자바의 정석", "남중성", 35000));
		books.add(new Book(100, "자바의 정석", "남중성", 35000));
		books.add(new Book(101, "이것이 자바", "신용권", 32000));
		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 29000));
		
		// List객체에 저장된 책정보 출력하기
		// List객체는 주로 향상된 for문을 통해 뿌린다.
		for (Book book : books) {
			System.out.println(book.hashCode());
			System.out.println("번호: " + book.getNo());
			System.out.println("제목: " + book.getTitle());
			System.out.println("저자: " + book.getWriter());
			System.out.println("가격: " + book.getPrice());
			System.out.println();
		}
	}

}
