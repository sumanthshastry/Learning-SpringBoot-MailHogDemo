package com.shastry.mailhog.demo.MailhogIntegration.controller;

import com.shastry.mailhog.demo.MailhogIntegration.model.User;
import com.shastry.mailhog.demo.MailhogIntegration.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public User create(@RequestBody @Valid final User user) {
        return userService.create(user);
    }
}
