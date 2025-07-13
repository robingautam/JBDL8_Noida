package org.gfg.removingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
     // Person person =  applicationContext.getBean("person", Person.class);
       // System.out.println(person);

       Student student = applicationContext.getBean("rob", Student.class);
        System.out.println(student);

    }
}
