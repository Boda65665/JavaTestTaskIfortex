package com.example.java_ifortex_test_task.mapper;

import com.example.java_ifortex_test_task.dto.SessionResponseDTO;
import com.example.java_ifortex_test_task.entity.Session;
import org.springframework.stereotype.Component;

@Component
public class SessionMapper {

    public SessionResponseDTO toDto(Session session) {
        SessionResponseDTO dto = new SessionResponseDTO();
        dto.setId(session.getId());
        dto.setDeviceType(session.getDeviceType());
        dto.setStartedAtUtc(session.getStartedAtUtc());
        dto.setEndedAtUtc(session.getEndedAtUtc());

        if (session.getUser() != null) {
            dto.setUserId(session.getUser().getId());
            dto.setUserFullName(getUserFullName(session));
        }

        return dto;
    }

    private String getUserFullName(Session session) {
        if (session.getUser() == null) {
            return null;
        }
        return String.format("%s %s",
                session.getUser().getFirstName(),
                session.getUser().getLastName());
    }
}