package com.niu.springboot.controller;

import com.niu.springboot.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ami on 2019/6/10.
 */
@Controller
public class BookController2 {
    @GetMapping("/books2")
    public ModelAndView books(HttpSession session){
        session.setAttribute("a", "a");
        ModelAndView mv = new ModelAndView();
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(111);
        b1.setName("三国演义11");
        b1.setAuthor("罗贯中11");
        Book b2 = new Book();
        b2.setId(112);
        b2.setName("红楼梦11");
        b2.setAuthor("曹雪芹11");
        books.add(b1);
        books.add(b2);
        mv.addObject("a", "cc");
        mv.addObject("books",books);
        //        设置视图名字books.ftl
        mv.setViewName("books");
        return mv;
    }
}
