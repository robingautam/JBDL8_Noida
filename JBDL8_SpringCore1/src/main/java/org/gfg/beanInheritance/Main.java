package org.gfg.beanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/gfg/beanInheritance/bconfig.xml");
       Employee employee = applicationContext.getBean("aemp", Employee.class);
        Employee employee2 = applicationContext.getBean("aemp", Employee.class);
        System.out.println(employee.hashCode());
        System.out.println(employee2.hashCode());
    }
}
