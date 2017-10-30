package com.example.demospringboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppleStoreLoginRepository extends JpaRepository<AppleStoreLogin, Long>{

    Integer countAllByUsernameAndPassword(String username, String password);
}
