package guru.springframework.spring6webapp.Services;

import guru.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();


}
