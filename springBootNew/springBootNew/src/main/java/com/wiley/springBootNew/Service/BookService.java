package com.wiley.springBootNew.Service;

import com.wiley.springBootNew.model.Author;


import java.util.List;

public interface BookService {
    public Author createBook(Author dep) ;

    public List<Author> getAllBookList();

    public Author getBookById(Long bookId);

}
