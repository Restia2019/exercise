package com.how2java.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.how2java.pojo.Category;
 
public class TestSpring {
 
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
 
        Category s = (Category) context.getBean("c");
         
        System.out.println(s.getName());
        
        Product p = (Product) context.getBean("p");
        
        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());
    }
}