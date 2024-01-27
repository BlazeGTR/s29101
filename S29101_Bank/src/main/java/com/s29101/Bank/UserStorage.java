package com.s29101.Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserStorage {
    private List<User> users = new ArrayList<>();

    public List<User> getListaUserow() { return users; }
    public void addUser(User user) { users.add(user); }
    public void purgeList() { users.clear(); }
}
