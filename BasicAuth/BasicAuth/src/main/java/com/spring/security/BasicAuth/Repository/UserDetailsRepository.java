package com.spring.security.BasicAuth.Repository;

import com.spring.security.BasicAuth.Entity.users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<users, Long> {
    Optional<users> findByUsername(String username);

}
