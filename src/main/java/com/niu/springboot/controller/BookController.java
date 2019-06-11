package com.niu.springboot.controller;

import com.niu.springboot.bean.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ami on 2019/6/10.
 */
@RestController
public class BookController {
    @GetMapping("/books")
    public ModelAndView books(){
        ModelAndView mv = new ModelAndView();
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setName("三国演义");
        b1.setAuthor("罗贯中");
        Book b2 = new Book();
        b2.setId(2);
        b2.setName("红楼梦");
        b2.setAuthor("曹雪芹");
        books.add(b1);
        books.add(b2);
        mv.addObject("books",books);
//        设置视图名字books.html
        mv.setViewName("books");
        return mv;
    }

    @GetMapping("/book")
    @ResponseBody
    public Book book(){
        Book b1 = new Book();
        b1.setId(1);
        b1.setName("三国演义");
        b1.setAuthor("罗贯中");
        b1.setPrice(39f);
        b1.setPublicationDate(new Date());
        return b1;
    }
}
