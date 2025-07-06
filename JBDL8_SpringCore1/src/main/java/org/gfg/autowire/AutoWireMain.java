package org.gfg.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/gfg/autowire/autowireconfig.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
