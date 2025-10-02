package dev.kuchishkin.Testing.lesson3.service;


import dev.kuchishkin.Testing.lesson3.model.User;
import dev.kuchishkin.Testing.lesson3.repository.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class UserServiceTest {

    @Test
    void shouldReturnUserNameWhenUserExists() {
        // Arrange: создаём мок для UserRepository и настраиваем его поведение.
        UserRepository userRepositoryMock = mock(UserRepository.class);
        User dummyUser = new User(1, "Alice");
        // Указываем, что когда идет обращение к заглушке, то надо вернуть dummyUser
        when(userRepositoryMock.findUserById(1)).thenReturn(dummyUser);

        // Создаём объект UserService с замоканным репозиторием.
        UserService userService = new UserService(userRepositoryMock);

        // Act: вызываем тестируемый метод.
        String userName = userService.getUserName(1);

        // Assert: проверяем, что имя пользователя совпадает с ожидаемым.
        assertEquals("Alice", userName);

        // Verify: убеждаемся, что метод findUserById был вызван один раз с аргументом 1.
        verify(userRepositoryMock, times(1)).findUserById(1);
    }

    @Test
    void shouldReturnUnknownWhenUserDoesNotExist() {
        // Arrange: создаём мок, но не задаём возвращаемое значение для пользователя с id 2.
        UserRepository userRepositoryMock = mock(UserRepository.class);
        when(userRepositoryMock.findUserById(2)).thenReturn(null);

        UserService userService = new UserService(userRepositoryMock);

        // Act: получаем имя пользователя, которого нет в системе.
        String userName = userService.getUserName(2);

        // Assert: так как пользователь не найден, метод должен вернуть "Unknown".
        assertEquals("Unknown", userName);

        // Verify: убеждаемся, что findUserById был вызван с нужным аргументом.
        verify(userRepositoryMock, times(1)).findUserById(2);
    }

    @Test
    void shouldReturnTrueWhenUserAdded(){
        UserRepository userRepositoryMock = mock(UserRepository.class);
        User dummyUser = new User(1, "Alice");
        when(userRepositoryMock.saveUser(dummyUser)).thenReturn(true);
        UserService userService = new UserService(userRepositoryMock);

        boolean added = userService.createUser(dummyUser);

        assertTrue(added);
        verify(userRepositoryMock, times(1)).saveUser(dummyUser);
    }

    @Test
    void shouldReturnFalseWhenNullUserAdded(){
        UserRepository userRepositoryMock = mock(UserRepository.class);
        User dummyUser = null;
        when(userRepositoryMock.saveUser(dummyUser)).thenReturn(false);
        UserService userService = new UserService(userRepositoryMock);

        boolean added = userService.createUser(dummyUser);

        assertFalse(added);
        verify(userRepositoryMock, times(1)).saveUser(dummyUser);
    }
}
