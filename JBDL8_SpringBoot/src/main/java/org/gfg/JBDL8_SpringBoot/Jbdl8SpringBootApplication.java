package org.gfg.JBDL8_SpringBoot;

import org.gfg.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
@ComponentScan(basePackages = "org.gfg")
//@EnableAutoConfiguration(exclude = {DispatcherServletAutoConfiguration.class, ErrorMvcAutoConfiguration.class})
public class Jbdl8SpringBootApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(Jbdl8SpringBootApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Student student = applicationContext.getBean("student", Student.class);
		System.out.println(student);
	}
}
