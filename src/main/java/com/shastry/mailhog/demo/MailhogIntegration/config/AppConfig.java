package com.shastry.mailhog.demo.MailhogIntegration.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@RequiredArgsConstructor
//@EnableConfigurationProperties(MailConfig.class)
public class AppConfig {

    private final MailConfig mailConfig;

    @Bean
    public JavaMailSender mailSender() {

        final JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(mailConfig.getHost());
        mailSender.setPort(mailConfig.getPort());
        mailSender.setUsername(mailConfig.getUserName());
        mailSender.setPassword(mailConfig.getPassword());

        return mailSender;
    }
}
