package com.s29101.Bank;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserStorage userStorage;
    @Autowired
    private UserService userService;

    @AfterEach
    void cleanup()
    {
        userStorage.purgeList();
    }

    @Test
    void shouldNotFindUser()
    {
        //GIVEN
        userStorage.addUser(new User(1,100,"ABC","DEF"));

        //WHEN
        Optional<User> userByID = userService.findUserByID(2);

        //THEN
        assertThat(userByID).isNotPresent();
    }

    @Test
    void shouldNotFindUser2()
    {
        //GIVEN
        userStorage.addUser(new User(1,100,"ABC","DEF"));
        userStorage.addUser(new User(3,1002,"ABSC","DEFG"));

        //WHEN
        Optional<User> userByID = userService.findUserByID(2);

        //THEN
        assertThat(userByID).isNotPresent();
    }

    @Test
    void shouldFindUser()
    {
        //GIVEN
        userStorage.addUser(new User(1,100,"ABC","DEF"));
        userStorage.addUser(new User(2,1002,"ABSC","DEFG"));

        //WHEN
        Optional<User> userByID = userService.findUserByID(2);

        //THEN
        assertThat(userByID).isPresent();
    }

    @Test
    void shouldFindUser2()
    {
        //GIVEN
        userStorage.addUser(new User(1,100,"ABC","DEF"));

        //WHEN
        Optional<User> userByID = userService.findUserByID(1);

        //THEN
        assertThat(userByID).isPresent();
    }
}
