package com.niit.bocado.service;

import java.util.List;

public interface UserCircle_service {
	boolean addUserToCircle(String emailId,String circleName);
	boolean deleteUserFromCircle(String emailId,String circleName);
    List<String> getUserOFCircle(String circleName);
}
