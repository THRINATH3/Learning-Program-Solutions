package com.library.LibraryManagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext apC = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bs = apC.getBean("bookService",BookService.class);
        bs.addBook("Spring FrameWork");
    }
}
