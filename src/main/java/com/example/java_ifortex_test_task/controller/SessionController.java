package com.example.java_ifortex_test_task.controller;

import com.example.java_ifortex_test_task.dto.SessionResponseDTO;
import com.example.java_ifortex_test_task.service.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
@RequiredArgsConstructor
public class SessionController {

    private final SessionService sessionService;

    @GetMapping("/first-desktop")
    public ResponseEntity<SessionResponseDTO> getFirstDesktopSession() {
        return ResponseEntity.ok(sessionService.getFirstDesktopSession());
    }

    @GetMapping("/active-users-ended-before-2025")
    public ResponseEntity<List<SessionResponseDTO>> getSessionsFromActiveUsersEndedBefore2025() {
        return ResponseEntity.ok(sessionService.getSessionsFromActiveUsersEndedBefore2025());
    }
}