package com.Ems.Ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ems.Ems.security.Role;

@Repository("roleRepository")
public interface RoleRepositories extends JpaRepository<Role, Integer> {

 Role findByRole(String role);
}
