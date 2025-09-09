package org.gfg.JBDL8_EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Jbdl8EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jbdl8EurekaServerApplication.class, args);
	}

}
