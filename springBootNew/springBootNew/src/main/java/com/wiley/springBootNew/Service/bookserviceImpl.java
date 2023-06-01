package com.wiley.springBootNew.Service;

import com.wiley.springBootNew.model.Author;
import com.wiley.springBootNew.model.Department;
import com.wiley.springBootNew.repository.Bookrepo;
import com.wiley.springBootNew.repository.DepRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;
@Service
public class bookserviceImpl implements BookService {

    @Autowired
    private Bookrepo bookrepo;
    @Override
    public Author createBook(Author dep) {
        return bookrepo.save(dep);
    }

    @Override
    public List<Author> getAllBookList() {
         return bookrepo.findAll();
    }

    @Override
    public Author getBookById(Long bookId) {
        Optional<Author>book=bookrepo.findById(bookId);
        return book.get();
    }
}
