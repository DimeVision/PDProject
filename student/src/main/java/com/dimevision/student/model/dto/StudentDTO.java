package com.dimevision.student.model.dto;

/**
 * @author Dimevision
 * @version 0.1
 */

public record StudentDTO(
        String name,
        String email,
        String phone,
        GroupDTO group
) {
}
