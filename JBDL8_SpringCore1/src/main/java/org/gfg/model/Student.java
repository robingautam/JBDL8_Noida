package org.gfg.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student { // POJO
    int id;
    String name;
    String email;
    List<String> subjects;
    Map<String,Integer> marks;
    Set<Integer> set;

    Address address;

    public Student(){}

    public Student(String name, String email, int id){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Setting the id");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting the name");
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Setting the email");
        this.email = email;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subjects=" + subjects +
                ", marks=" + marks +
                ", set=" + set +
                ", address=" + address +
                '}';
    }
}
