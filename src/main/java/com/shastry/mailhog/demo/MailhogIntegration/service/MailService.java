package com.shastry.mailhog.demo.MailhogIntegration.service;

import com.shastry.mailhog.demo.MailhogIntegration.config.MailConfig;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {

    private final JavaMailSender emailSender;
    private final MailConfig mailConfig;

    @SneakyThrows
    public void doSend(String toAddress) {

        MimeMessagePreparator preparator = (mimeMessage) -> {
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
            messageHelper.setSubject("Welcome to Mailhog Demo App.");
            messageHelper.setTo(toAddress);
            messageHelper.setFrom(mailConfig.getFromAddress());
            messageHelper.setText("Successfully created account in Mailhog app.");

        };

        emailSender.send(preparator);
    }
}
