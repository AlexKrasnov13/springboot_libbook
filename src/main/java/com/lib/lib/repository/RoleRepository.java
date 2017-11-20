package com.lib.lib.repository;

import com.lib.lib.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByRole(String role);

}
