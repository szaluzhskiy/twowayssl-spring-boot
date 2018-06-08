package io.pivotal.boot.clientauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Vinicius Carvalho
 */
@Component
public class HttpClient implements CommandLineRunner {

	@Autowired
	private HelloFeign feign;

	@Autowired
	private ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(feign.hello());
	}
}
