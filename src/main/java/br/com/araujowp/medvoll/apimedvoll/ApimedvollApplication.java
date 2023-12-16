package br.com.araujowp.medvoll.apimedvoll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
public class ApimedvollApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApimedvollApplication.class, args);
	}

}
