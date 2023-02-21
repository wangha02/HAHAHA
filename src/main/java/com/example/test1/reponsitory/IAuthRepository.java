package com.example.test1.reponsitory;

import com.example.test1.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthRepository extends JpaRepository<Auth, Long> {
    Boolean exitsByName(String name);
}
