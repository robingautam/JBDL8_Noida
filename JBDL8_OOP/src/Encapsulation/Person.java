package Encapsulation;

public class Person {
    private int age;
    private String name;
    private String email;


    public void setAge(int age){
        if (age<0){
            return;
        }
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
