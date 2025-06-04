package com.example.java_ifortex_test_task.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDTO {

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private boolean deleted;
}