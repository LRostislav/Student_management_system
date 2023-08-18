package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.dto.StudentDto;
import com.example.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
