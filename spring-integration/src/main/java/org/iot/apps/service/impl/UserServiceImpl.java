package org.iot.apps.service.impl;

import org.iot.apps.beans.User;
import org.iot.apps.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User addUser(User user) {
        return new User("user1",1001);
    }

    @Override
    public boolean deleteUser(int userId) {
        return true;
    }

    @Override
    public User getUser(int userId) {
        return new User("user2",1002);
    }

    @Override
    public List<User> getUser() {
        List<User> users = new ArrayList<>();
        users.add(new User("user3",1003));
        users.add(new User("user4",1004));
        users.add(new User("user5",1005));
        users.add(new User("user6",1006));
        users.add(new User("user7",1007));
        users.add(new User("user8",1008));
        users.add(new User("user9",1009));
        return users;
    }
}
