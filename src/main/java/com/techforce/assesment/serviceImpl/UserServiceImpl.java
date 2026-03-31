package com.techforce.assesment.serviceImpl;

import com.techforce.assesment.Model.User;
import com.techforce.assesment.Repository.UserRepository;
import com.techforce.assesment.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User loginUser(String email, String password) {

        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        User user = optionalUser.get();

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return user;
    }
}
