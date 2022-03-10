package com.dimevision.model.dto;

import com.dimevision.student.model.dto.StudentDTO;

import java.util.List;

/**
 * @author Dimevision
 * @version 0.1
 */

public record TeamDTO(
        String name,
        List<StudentDTO> students,
        List<StartupDTO> startups
) {
}
