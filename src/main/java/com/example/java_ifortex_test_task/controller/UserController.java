package com.example.java_ifortex_test_task.controller;

import com.example.java_ifortex_test_task.dto.UserResponseDTO;
import com.example.java_ifortex_test_task.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/most-active")
    public ResponseEntity<UserResponseDTO> getUserWithMostSessions() {
        return ResponseEntity.ok(userService.getUserWithMostSessions());
    }

    @GetMapping("/with-mobile-sessions")
    public ResponseEntity<List<UserResponseDTO>> getUsersWithAtLeastOneMobileSession() {
        return ResponseEntity.ok(userService.getUsersWithAtLeastOneMobileSession());
    }
}
