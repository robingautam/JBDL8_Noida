package org.gfg.beanInheritance;

import org.springframework.context.annotation.Scope;


public class Employee extends Person {

    String email;
    String empcode;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "email='" + email + '\'' +
                ", empcode='" + empcode + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
