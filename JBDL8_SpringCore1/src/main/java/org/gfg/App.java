package org.gfg;


import org.gfg.model.Student;
import org.gfg.model.TwoSum;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Student student =  applicationContext.getBean("student",Student.class);
        System.out.println(student);


        // Constructor Injection
      /*  Student student =  applicationContext.getBean("student",Student.class);
        System.out.println(student);*/

      //  TwoSum twoSum = (TwoSum) applicationContext.getBean("twosum");

    }
}
