package com.dimevision.student.repository;

import com.dimevision.student.model.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dimevision
 * @version 0.1
 */

public interface GroupRepository extends JpaRepository<Group, Long> {

    Group findByName(String name);
}
