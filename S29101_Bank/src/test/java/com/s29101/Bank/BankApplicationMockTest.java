package com.s29101.Bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
/*
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class BankApplicationMockTests {

    @Mock
    private UserStorage userStorage;
    @Mock
    private UserService userService;

    @AfterEach
    void cleanup()
    {
        userStorage.purgeList();
    }

    @Test
    void mockitoTest()
    {
        //given
        User mockUser = new User(10,1000,"ASD","dsa");
        when(userService.findUserByID(anyInt())).thenReturn(Optional.of(mockUser));

        //when
        ReturnInfoObject ret = userService.receiveTransfer(5,500);

        //then
        //assertThat(ret.getStatusCode()).isEqualTo(0);
    }

}
*/