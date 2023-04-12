package sample09_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import sample08_list.Book;

public class BookApp2 {

	public static void main(String[] args) {
		Set<Book> books = new HashSet<>();
		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 35000));
		books.add(new Book(103, "Do it! 점프 투 파이썬", "박응용", 35000));
		books.add(new Book(100, "자바의 정석", "남중성", 35000));
		books.add(new Book(104, "혼자 공부하는 파이썬", "윤인성", 21000));
		books.add(new Book(105, "모던 자바스크립트", "이웅모", 42000));
		books.add(new Book(101, "이것이 자바", "신용권", 32000));
		
		// 105번 책을 삭제하기
		// 향상된 for문 실행 중에 콜렉션의 객체를 삭제할 수 없다.
//		for (Book book : books) {
//			System.out.println("책번호 -> " + book.getNo());
//			if (book.getNo() == 101) {
//				books.remove(book); // for문을 실행하는 도중에 삭제할 수 없다.
//			}
//		}
		
		// 책번호가 짝수인 책정보를 삭제하기
		//iterator객체는 모든 콜렉션의 하위객체가 다 가지고 있음
		Iterator<Book> iter = books.iterator(); //list나 hashSet에 구현되어있는데 iterator 생성하는 것이다.
		
		while (iter.hasNext()) {
			Book book = iter.next();
			if(book.getNo()%2 == 0) {
				iter.remove();
			}
		}
		
		// Set객체에 저장된 객체의 갯수 조회하기
		System.out.println("저장된 객체의 갯수 -> " + books.size());
		
		
	}
}
