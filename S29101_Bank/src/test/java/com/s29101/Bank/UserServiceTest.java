package com.s29101.Bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;


public class UserServiceTest {

    private UserStorage userStorage = new UserStorage();
    private UserService userService = new UserService();

    @AfterEach
    void cleanup()
    {
        userStorage.purgeList();
    }

    @Test
    void test()
    {}

}
