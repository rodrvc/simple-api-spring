package com.example.stringbootapi.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {

    @Query("Select u From User u WHERE u.userName = ?1")
    Optional<User>  findUserByUserName(String email);
}
