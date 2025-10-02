package dev.kuchishkin.Testing.lesson3.repository;


import dev.kuchishkin.Testing.lesson3.model.User;


public interface UserRepository {
    User findUserById(int id);
    boolean  saveUser(User user);
}
