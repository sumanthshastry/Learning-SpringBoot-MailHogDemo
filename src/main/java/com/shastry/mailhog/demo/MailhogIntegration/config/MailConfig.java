package com.shastry.mailhog.demo.MailhogIntegration.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.mail")
@Data
public class MailConfig {

    private String host;
    private int port;
    private String userName;
    private String password;
    private String fromAddress;

}
