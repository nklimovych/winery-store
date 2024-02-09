package com.petervine.winerystore.service.impl;

import com.petervine.winerystore.exception.BadRequestException;
import com.petervine.winerystore.model.User;
import com.petervine.winerystore.repository.RoleRepository;
import com.petervine.winerystore.repository.UserRepository;
import com.petervine.winerystore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        if (user != null) {
            user.setRole(roleRepository.findById(2l).get());
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userRepository.save(user);
        }
        throw new BadRequestException("User cannot be 'null'");
    }
}
