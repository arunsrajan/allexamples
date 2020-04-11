package org.wmq.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations= {"classpath:camel-context.xml"})
public class AmqStarter {

	public static void main(String[] args) {
		SpringApplication.run(AmqStarter.class, args);
	}

}
