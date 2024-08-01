package com.example.pfe.repository;

import com.example.pfe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "User")
public interface UserRepository extends JpaRepository<User, Long>  {
    User findByUsername(String username);
}
