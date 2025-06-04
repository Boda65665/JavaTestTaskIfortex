package com.example.java_ifortex_test_task.mapper;


import com.example.java_ifortex_test_task.dto.UserResponseDTO;
import com.example.java_ifortex_test_task.entity.User;
import org.springframework.stereotype.Component;


@Component
public class UserMapper {

    public UserResponseDTO toDto(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setMiddleName(user.getMiddleName());
        dto.setEmail(user.getEmail());
        dto.setDeleted(user.isDeleted());

        return dto;
    }

}