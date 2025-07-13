package org.gfg.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("rob")
@Component
//@Scope("prototype")
public class Student {
    @Value("1")
    int id;
    @Value("Robin")
    String name;
    @Value("robin@gmail.com")
    String email;


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
