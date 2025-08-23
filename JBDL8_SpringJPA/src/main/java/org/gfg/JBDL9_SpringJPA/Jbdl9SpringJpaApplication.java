package org.gfg.JBDL9_SpringJPA;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Jbdl9SpringJpaApplication implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(Jbdl9SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Saavan");
		employee.setEmail("saavan@gmail.com");
		// saving the data
		//personRepository.save(employee);

		System.out.println(personRepository.getClass().getName());

	//	System.out.println("Saved");*/

		// fetch the data

	/*	Employee fetch = personRepository.findById(1).get();

		System.out.println(fetch);

		fetch.setEmail("robin@gmil,com");

		personRepository.save(fetch);

		System.out.println("Updated");*/

	//	personRepository.deleteById(1);

	//	System.out.println("deleted");

//	Employee employee1 =	personRepository.findByNameOrEmail("Saavan", "saavan1@gmail.com");

	//	System.out.println(employee1);

	//	List<Employee> list = personRepository.findByIdBetween(1,10);

	//	System.out.println(list);

	//List<Employee>	employeeList = personRepository.findByNameLike("%ra%");

	//	System.out.println(employeeList);

//	Employee obj =	personRepository.findByNameQuery("saavan");

	//	System.out.println(obj);

		personRepository.updateEmailById("rob@gmail.com",1);

		System.out.println("data Updated");




	}
}
