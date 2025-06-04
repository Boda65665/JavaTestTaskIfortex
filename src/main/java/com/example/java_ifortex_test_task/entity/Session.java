package com.example.java_ifortex_test_task.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "sessions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "device_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private DeviceType deviceType;

    @Column(name = "ended_at_utc")
    private LocalDateTime endedAtUtc;

    @Column(name = "started_at_utc", nullable = false)
    private LocalDateTime startedAtUtc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
