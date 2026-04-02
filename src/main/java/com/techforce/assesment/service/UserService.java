package com.techforce.assesment.service;

import com.techforce.assesment.Model.User;

public interface UserService {
    User registerUser(User user);
    User loginUser(String email, String password);
}
