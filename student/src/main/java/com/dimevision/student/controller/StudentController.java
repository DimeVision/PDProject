package com.dimevision.student.controller;

import com.dimevision.student.model.dto.StudentDTO;
import com.dimevision.student.model.entity.Student;
import com.dimevision.student.model.mapper.StudentMapper;
import com.dimevision.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dimevision
 * @version 0.1
 */

@RestController
@RequestMapping("/api/v1/students")
@Slf4j
public record StudentController(
        StudentService studentService,
        StudentMapper studentMapper
) {

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getAllStudents() {
        log.info("[TEST TAG]: ");

        List<Student> students = studentService.findAllStudents();
        List<StudentDTO> studentDTOs = studentMapper.toStudentDTOs(students);

        return ResponseEntity.ok(studentDTOs);
    }

    @PostMapping
    public ResponseEntity<StudentDTO> registerStudent(@RequestBody StudentDTO studentDTO) {
        log.info("[REGISTRATION] - new student registered: {}", studentDTO);
        Student student = studentMapper.toStudent(studentDTO);
        studentService.createStudent(student);

        return ResponseEntity.status(HttpStatus.CREATED).body(studentDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudent(@PathVariable("id") Long id) {
        Student student = studentService
                .findStudentById(id);

        StudentDTO studentDto = studentMapper.toStudentDTO(student);
        return ResponseEntity.ok(studentDto);
    }
}
