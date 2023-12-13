package com.harold18m.evaluacion.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 8)
    private Long id;
    @Column(length = 20, name = "name")
    private String name;
    @Column(length = 100, name = "description")
    private String description;

}
