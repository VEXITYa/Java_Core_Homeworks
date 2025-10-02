package dev.kuchishkin.Testing.lesson3.service;


import dev.kuchishkin.Testing.lesson3.model.User;
import dev.kuchishkin.Testing.lesson3.repository.UserRepository;


public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Метод возвращает имя пользователя, если пользователь найден, или "Unknown"
    public String getUserName(int id) {
        User user = userRepository.findUserById(id);
        return user != null ? user.getName() : "Unknown";
    }

    public boolean createUser(User user) {
        return userRepository.saveUser(user);
    }
}
