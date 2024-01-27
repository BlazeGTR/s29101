package com.s29101.Bank;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserStorage userStorage;

    public UserService(UserStorage storage)
    {
        this.userStorage = storage;
    }

    public Optional<User> findUserByID(int id) {
        return userStorage.getListaUserow().stream()
                .filter(user -> user.getId()==id)
                .findFirst();
    }
}
