package com.challenge3.msuser.repository;

import com.challenge3.msuser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
