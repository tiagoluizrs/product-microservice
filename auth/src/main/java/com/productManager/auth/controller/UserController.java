package com.productManager.auth.controller;

import com.productManager.auth.domain.User;
import com.productManager.auth.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController extends GenericController<User> {
    public UserController(UserService service) {
        super(service);
    }

}