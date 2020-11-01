package com.xxs.dao;

import com.xxs.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    void insert(User user);

    void update(@Param("username") String username,@Param("id") Integer id);

    void delete(Integer id);

    User findById(Integer id);

    User findByUserNameAndPWD(@Param("username") String username,@Param("password") String password);

    List<User> findNameLike(String username);
}
