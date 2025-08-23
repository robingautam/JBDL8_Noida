package org.gfg;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Student student = new Student();
        student.setId(2); student.setName("Sagar"); student.setEmail("sagar@gmail.com");

        Transaction transaction = session.beginTransaction();
     //   session.save(student);
        // check balance
        // debit amount
        // credit amount

       Student output = session.get(Student.class,1);
        // System.out.println(output);
        //output.setEmail("newemail@gmail.com");
        //session.save(output);

        session.delete(output);

        transaction.commit();
        System.out.println("Data Saved");
    }
}
