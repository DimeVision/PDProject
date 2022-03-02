package com.dimevision.student.repository;

import com.dimevision.student.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dimevision
 * @version 0.1
 */

public interface StudentRepository extends JpaRepository<Student, Long> {
}
