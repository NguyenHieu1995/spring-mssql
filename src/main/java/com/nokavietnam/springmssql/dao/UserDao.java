package com.nokavietnam.springmssql.dao;

import com.nokavietnam.springmssql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : NOKA NGUYEN
 * @since : 6/1/2021, Tue
 **/
@Repository
public interface UserDao extends JpaRepository<User, Long> {
    List<User> getAll();
    User getUserById();
}
