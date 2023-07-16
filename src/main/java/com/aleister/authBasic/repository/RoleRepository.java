package com.aleister.authBasic.repository;

import com.aleister.authBasic.dto.ERole;
import com.aleister.authBasic.dto.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
   Optional<RoleEntity> findByName(ERole name);
}
