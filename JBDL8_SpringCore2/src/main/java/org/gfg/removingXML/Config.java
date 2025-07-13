package org.gfg.removingXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.gfg.removingXML")
public class Config {

    @Bean(name = {"student", "rob"})
    public Student getStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("AAkash");
        student.setEmail("aakash@gmail.com");
        return  student;
    }

}
