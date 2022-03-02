package com.dimevision.student.model.mapper;

import com.dimevision.student.model.dto.StudentDTO;
import com.dimevision.student.model.entity.Student;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Dimevision
 * @version 0.1
 */

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO toStudentDTO(Student student);

    List<StudentDTO> toStudentDTOs(List<Student> students);

    Student toStudent(StudentDTO studentDto);
}
