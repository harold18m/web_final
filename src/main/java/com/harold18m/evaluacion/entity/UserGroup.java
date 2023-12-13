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
@Table(name = "users_groups")
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 8)
    private Long id;
    @Column(length = 100 , name = "user_name")
    private String user;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

}
