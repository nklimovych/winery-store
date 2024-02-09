package com.petervine.winerystore.controller;

import com.petervine.winerystore.config.JwtUtils;
import com.petervine.winerystore.dto.UserDto;
import com.petervine.winerystore.service.impl.UserDetailsServiceImpl;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private JwtUtils jwtUtils;
    private UserDetailsServiceImpl userService;
    private ModelMapper modelMapper;

    @PostMapping("/data")
    public ResponseEntity<UserDto> getUserDataByJwtToken(@RequestBody String jwtToken) {
        var user = userService.loadUserByUsername(jwtUtils.extractUsername(jwtToken));
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return ResponseEntity.ok(userDto);
    }
}