package com.techforce.assesment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techforce.assesment.Model.User;
import java.util.Optional;

public interface userRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
    Boolean existsByEmail(String email);
}
