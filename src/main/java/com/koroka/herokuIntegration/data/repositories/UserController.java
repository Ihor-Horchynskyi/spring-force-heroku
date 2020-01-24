package com.koroka.herokuIntegration.data.repositories;

import com.koroka.herokuIntegration.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserController extends JpaRepository<User, Long> {

}
