package org.iot.apps.service;

import org.iot.apps.beans.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    boolean deleteUser(int userId);
    User getUser(int userId);
    List<User> getUser();
}
