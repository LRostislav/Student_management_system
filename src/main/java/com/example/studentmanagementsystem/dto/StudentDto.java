package com.example.studentmanagementsystem.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDto {
    private Long id;

    // @Column(name = "first_name", nullable = false)
    private String firstName;

    // @Column(name = "last_name")
    private String lastName;

    // @Column(name = "email")
    private String email;

}
