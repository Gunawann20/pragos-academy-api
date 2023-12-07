package org.binar.pragosacademyapi.repository;

import org.binar.pragosacademyapi.entity.User;
import org.binar.pragosacademyapi.enumeration.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    @Query("select u.id from User u where u.role != :role")
    List<Long> allUserId(Role role);
}
