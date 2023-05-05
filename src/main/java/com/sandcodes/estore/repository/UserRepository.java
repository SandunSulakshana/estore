package com.sandcodes.estore.repository;

import com.sandcodes.estore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
