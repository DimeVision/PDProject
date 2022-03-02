package com.dimevision.student.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Dimevision
 * @version 0.1
 */

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "faculties")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "facultyId")
    @JsonManagedReference
    @ToString.Exclude
    private Set<Group> groups;
}
