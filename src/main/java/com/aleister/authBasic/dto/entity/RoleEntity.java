package com.aleister.authBasic.dto.entity;

import com.aleister.authBasic.dto.ERole;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class RoleEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id_role")
        private Long id;

        @Enumerated(EnumType.STRING)
        @Column(length = 20)
        private ERole name;




}
