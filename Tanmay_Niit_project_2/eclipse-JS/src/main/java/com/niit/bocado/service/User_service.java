package com.niit.bocado.service;

import java.util.List;

import com.niit.bocado.model.User;

public interface User_service {
public boolean save(User user);
public boolean update(User user);
public User get(String id);
public List<User> list();
public User validate(String id,String password);
}
