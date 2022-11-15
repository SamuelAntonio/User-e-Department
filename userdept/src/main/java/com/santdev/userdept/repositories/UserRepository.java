package com.santdev.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santdev.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
