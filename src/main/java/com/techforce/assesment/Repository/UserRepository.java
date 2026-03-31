package com.techforce.assesment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.techforce.assesment.Model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
