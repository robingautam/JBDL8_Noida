package hashnequals;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Robin");
        student.setEmail("robin@gmail.com");

        Student st2 = new Student();
        st2.setId(1);
        st2.setName("aakash");
        st2.setEmail("robin@gmail.com");

        System.out.println(student.hashCode());
        System.out.println(student.equals(st2));

        Set<Student> set =new HashSet<>();
        set.add(student);
        set.add(st2);

        System.out.println(set.size());


    }
}
