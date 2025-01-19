package com.shastry.mailhog.demo.MailhogIntegration.service;

import com.shastry.mailhog.demo.MailhogIntegration.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {

    private final MailService mailService;

    public User create(User user) {

        // Send email to the customer.
        mailService.doSend(user.getEmail());

        return user;
    }
}
