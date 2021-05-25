package org.mql.java.junit5.dynamicTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.mql.java.junit5.livre.model.Book;
import org.mql.java.junit5.livre.service.BookService;

class DynamicTestExample {

	@TestFactory
	Collection<DynamicTest> dynamicTestsAvecCollection() {
		Collection<DynamicTest> resultat = new ArrayList<>();
		BookService bookService = new BookService();

		for (int i = 1; i <= 5; i++) {
			Book headFirstJavaBook = new Book("0"+ i, "Head First Java", "Wrox");
			bookService.addBook(headFirstJavaBook);
			List<Book> list = bookService.getList();
			resultat.add(DynamicTest.dynamicTest("Ajout num : " + i, 
					() -> assertFalse(list.isEmpty())));
		}
		return resultat;
	}

	@TestFactory
	Iterable<DynamicTest> dynamicTestAvecIterable() {
		List<DynamicTest> resultat = new ArrayList<>();
		BookService bookService = new BookService();

		for (int i = 1; i <= 5; i++) {
			Book headFirstJavaBook = new Book("0"+ i, "Head First Java", "Wrox");
			bookService.addBook(headFirstJavaBook);
			List<Book> list = bookService.getList();
			resultat.add(DynamicTest.dynamicTest("Ajout num : " + i, 
					() -> assertFalse(list.isEmpty())));
		}
		return resultat;
	}
	
	@TestFactory
	  Iterator<DynamicTest> dynamicTestsAvecIterator() {
	    List<DynamicTest> resultat = new ArrayList<>();
	    BookService bookService = new BookService();

		for (int i = 1; i <= 5; i++) {
			Book headFirstJavaBook = new Book("0"+ i, "Head First Java", "Wrox");
			bookService.addBook(headFirstJavaBook);
			List<Book> list = bookService.getList();
			resultat.add(DynamicTest.dynamicTest("Ajout num : " + i, 
					() -> assertFalse(list.isEmpty())));
		}
	    return resultat.iterator();
	  }
	
}
