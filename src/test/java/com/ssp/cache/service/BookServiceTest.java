package com.ssp.cache.service;

import com.ssp.cache.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * BookService test
 * @author: sunshaoping
 * @date: Create by in 6:22 PM 2018/12/3
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {

    public static final String ISBN = "1234.5677";

    @Autowired
    BookService bookService;

    @Test
    public void findBook() {
        Book book1 = bookService.findBook(ISBN);
        Book book2 = bookService.findBook(ISBN);

        assert book1.equals(book2);
    }

    @Test
    public void findBookCacheName() {
        Book book1 = bookService.findBookCacheName(ISBN);
        Book book2 = bookService.findBookCacheName(ISBN);

        assert book1.equals(book2);
    }
}