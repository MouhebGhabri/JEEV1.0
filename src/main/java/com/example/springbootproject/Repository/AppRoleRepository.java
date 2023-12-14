package com.example.springbootproject.Repository;

import com.example.springbootproject.Entity.AppRole;
import com.example.springbootproject.Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {

AppRole findByRoleName(String roleName);

}
