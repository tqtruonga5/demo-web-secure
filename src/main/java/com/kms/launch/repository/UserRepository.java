package com.kms.launch.repository;

import com.kms.launch.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by truongtran on 4/5/2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByEmail(String email);
}
