package org.gfg;


import org.gfg.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
       Student student = applicationContext.getBean("student", Student.class);
        Student student1 = applicationContext.getBean("student", Student.class);

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
