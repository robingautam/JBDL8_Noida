package hashnequals;

public class Student {

    int id;
    String name;
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    @Override
    public boolean equals(Object obj) {
        Student that = (Student) obj;
        return this.id==that.id && this.email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return this.id+this.name.hashCode();
    }
}
