package com.supertinder.poc.dao;


import com.supertinder.poc.models.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthDao extends JpaRepository<UserAuth, Integer> {
}
