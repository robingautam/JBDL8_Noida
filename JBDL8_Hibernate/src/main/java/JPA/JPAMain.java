package JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class JPAMain {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Person person = new Person();
        person.setId(1); person.setName("Kajal"); person.setEmail("kajal@gmail.com");

        entityManager.getTransaction().begin();

        entityManager.persist(person);

        entityManager.getTransaction().commit();

        System.out.println("data saved");
    }
}
