package com.niit.bocado.dao;

import java.util.List;

import com.niit.bocado.model.User;

public interface UserCircleDao {
	public boolean addUserToCircle(String emailId,String circleName);
	public boolean deleteUserfromCircle(String emailId, String circleName);
    public List<String> getUsersofCircle(String circleName);
	

}
