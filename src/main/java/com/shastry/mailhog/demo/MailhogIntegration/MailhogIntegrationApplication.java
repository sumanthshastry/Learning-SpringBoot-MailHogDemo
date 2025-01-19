package com.shastry.mailhog.demo.MailhogIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class MailhogIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailhogIntegrationApplication.class, args);
	}

}
