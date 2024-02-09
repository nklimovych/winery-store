package com.petervine.winerystore.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @GetMapping("/check")
    public ResponseEntity<Boolean> checkAdminState() {
        logger.info("Admin checking... " + LocalDateTime.now());
        return ResponseEntity.ok(true);
    }
}
