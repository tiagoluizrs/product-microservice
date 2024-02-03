package com.productManager.auth.service.impl;

import com.productManager.auth.domain.User;
import com.productManager.auth.repository.UserRepository;
import com.productManager.auth.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserServiceImpl extends GenericServiceImpl<User, Long, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
