package com.petervine.winerystore.controller;

import com.petervine.winerystore.config.JwtUtils;
import com.petervine.winerystore.dto.UserDto;
import com.petervine.winerystore.model.User;
import com.petervine.winerystore.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthenticationManager authenticationManager;
    private JwtUtils jwtUtils;
    private UserService userService;


    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody UserDto userDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        userDto.getEmail(),
                        userDto.getPassword()
                        ));
        UserDetails user = (UserDetails) authentication.getPrincipal();
        String jwtToken = jwtUtils.generateToken(user.getUsername());
        return ResponseEntity.ok(jwtToken);
    }

    @PostMapping("/signup")
    public ResponseEntity<Object> signup() {
        User user = userService.create(User.builder()
                        .email("v.siverskiy@gmail.com")
                        .firstName("vlad")
                        .lastName("vlad")
                        .password("admin")
                .build());
        var jwtToken = jwtUtils.generateToken(user.getUsername());
        return ResponseEntity.ok(jwtToken);
    }
}