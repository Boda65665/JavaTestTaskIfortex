package com.example.java_ifortex_test_task.dto;

import com.example.java_ifortex_test_task.entity.DeviceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SessionResponseDTO {
    private Long id;
    private DeviceType deviceType;
    private LocalDateTime endedAtUtc;
    private LocalDateTime startedAtUtc;
    private Long userId;
    private String userFullName;
}
