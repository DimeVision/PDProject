package com.dimevision.student.service;

import com.dimevision.student.exception.NotFoundException;
import com.dimevision.student.model.entity.Group;
import com.dimevision.student.model.entity.Student;
import com.dimevision.student.model.mapper.GroupMapper;
import com.dimevision.student.model.mapper.StudentMapper;
import com.dimevision.student.repository.GroupRepository;
import com.dimevision.student.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Dimevision
 * @version 0.1
 */

@Service
public record StudentService(
        StudentRepository studentRepository,
        GroupRepository groupRepository,
        StudentMapper studentMapper,
        GroupMapper groupMapper,
        RestTemplate restTemplate) {

    public void createStudent(Student registrationRequest) {
        Group group = groupRepository.findByName(registrationRequest.getGroup().getName())
                .orElseThrow(() -> new NotFoundException(
                        String.format("Group %s not exists in database", registrationRequest.getName()))
                );

        Student student = Student.builder()
                .name(registrationRequest.getName())
                .email(registrationRequest.getEmail())
                .phone(registrationRequest.getPhone())
                .group(group)
                .build();

        studentRepository.saveAndFlush(student);


        // TODO: 3/1/2022 Check if fraudster
        // TODO: 3/1/2022 Validation
        // TODO: 3/1/2022 Send notification
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student findStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(
                        String.format("Student with id=%d not found", id))
                );
    }

    public void deleteStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(
                        String.format("Student with id=%s not found", id))
                );

        studentRepository.delete(student);
    }

    public void updateStudent(Student student) {
        Group group = groupRepository.findByName(student.getGroup().getName())
                .orElseThrow(() ->
                        new NotFoundException(String.format("Group %s not exists in database", student.getName())));
        student.setGroup(group);

        studentRepository.save(student);
    }
}
