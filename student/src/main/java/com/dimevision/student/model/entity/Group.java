package com.dimevision.student.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    @JsonBackReference
    private Faculty facultyId;

    @OneToMany(mappedBy = "group")
    @ToString.Exclude
    @JsonManagedReference
    private Set<Student> students;
}
