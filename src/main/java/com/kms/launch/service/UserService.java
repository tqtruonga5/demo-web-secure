package com.kms.launch.service;

import com.kms.launch.domain.User;
import com.kms.launch.domain.UserCreateForm;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by truongtran on 4/5/2016.
 */
public interface UserService {
    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);
}
