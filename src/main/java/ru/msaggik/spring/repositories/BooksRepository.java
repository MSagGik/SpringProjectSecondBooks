package ru.msaggik.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.msaggik.spring.models.Book;
import ru.msaggik.spring.models.Person;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    // кастомные методы:
//    // 1) метод поиска книги по её владельцу
//    // (данный метод аналогичен методу person.getBooks())
//    List<Book> findByOwner(Person owner);
//    // 2) метод поиска книги по её названию
//    List<Book> findByTitle(String title);
    // 3) метод поиска книги по её названию или первой части названия
    List<Book> findByTitleStartingWith(String title);
}
