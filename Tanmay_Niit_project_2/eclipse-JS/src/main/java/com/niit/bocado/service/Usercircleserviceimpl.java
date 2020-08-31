package com.niit.bocado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.bocado.dao.CircleDao;
import com.niit.bocado.dao.UserCircleDao;
@Service
public class Usercircleserviceimpl implements UserCircle_service {
	@Autowired  
    private UserCircleDao usercircledao;

	@Override
	public boolean addUserToCircle(String emailId, String circleName) {
		// TODO Auto-generated method stub
		return usercircledao.addUserToCircle(emailId, circleName);
	}

	@Override
	public boolean deleteUserFromCircle(String emailId,String circleName) {
		// TODO Auto-generated method stub
		return usercircledao.deleteUserfromCircle(emailId, circleName);
	}

	@Override
	public List<String> getUserOFCircle(String circleName) {
		// TODO Auto-generated method stub
		return usercircledao.getUsersofCircle(circleName);
	}

}