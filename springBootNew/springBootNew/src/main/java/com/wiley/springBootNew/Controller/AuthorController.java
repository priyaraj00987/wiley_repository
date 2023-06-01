package com.wiley.springBootNew.Controller;

import com.wiley.springBootNew.Service.BookService;
import com.wiley.springBootNew.Service.DepService;
import com.wiley.springBootNew.model.Author;
import com.wiley.springBootNew.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AuthorController {
    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public Author createAuthor(@RequestBody Author book) {
        return bookService.createBook(book);
    }

    @GetMapping("/books")
    public List<Author> getAllAuthor() {
        return bookService.getAllBookList();
    }

    @GetMapping("/books/{id}")
    public Author getDepById(@PathVariable("id") Long bookId) {

        return bookService.getBookById(bookId);

    }
}
