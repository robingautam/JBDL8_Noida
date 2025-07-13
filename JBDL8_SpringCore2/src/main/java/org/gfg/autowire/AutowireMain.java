package org.gfg.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowireConfig.class);
        CustomClass customClass = applicationContext.getBean("custom", CustomClass.class);
        System.out.println(customClass.inter.getMethod());
    }
}
