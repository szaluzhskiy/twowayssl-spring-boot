package io.pivotal.boot.clientauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinicius Carvalho
 */
@SpringBootApplication
@RestController
public class ServerAuthApplication {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(ServerAuthApplication.class,args);
	}
}
