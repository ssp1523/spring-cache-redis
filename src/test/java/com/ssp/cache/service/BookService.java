package com.ssp.cache.service;

import com.ssp.cache.entity.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * book service
 * @author: sunshaoping
 * @date: Create by in 6:19 PM 2018/12/3
 */
@Service
@CacheConfig(cacheNames = "books")
public class BookService {


    @Cacheable(key = "#isbn")
    public Book findBook(String isbn) {
        return createBook(isbn);
    }

    private Book createBook(String isbn) {
        Book book = new Book();
        book.setId(new Random().nextLong());
        book.setIsbn(isbn);
        return book;
    }


    @Cacheable(cacheNames = "book2", key = "#isbn")
    public Book findBookCacheName(String isbn) {
        return createBook(isbn);
    }

}
