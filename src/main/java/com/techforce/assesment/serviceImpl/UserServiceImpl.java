package com.techforce.assesment.serviceImpl;

import com.techforce.assesment.Model.User;
import com.techforce.assesment.Repository.UserRepository;
import com.techforce.assesment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
