package com.niit.bocado.dao;

import java.util.List;

import com.niit.bocado.model.User;

public interface UserDao {
public boolean save(User user);
public boolean update(User user);
public User get(String id);
public List<User> list();
public User validate(String id,String password);
}
