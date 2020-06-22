package com.twschool.practice.repository;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, UserID> users = new HashMap<>();
    public void setUserId(String id ,UserID user) {
        users.put(id, user);

    }

    public UserID getUserInfoById(String id) {
        return users.get(id);
    }
}
