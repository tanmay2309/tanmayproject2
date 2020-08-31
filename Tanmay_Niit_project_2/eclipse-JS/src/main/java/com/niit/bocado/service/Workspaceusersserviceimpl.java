package com.niit.bocado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.niit.bocado.dao.WorkspaceUsersDao;
@Service
public class Workspaceusersserviceimpl implements WorkspaceUsers_service {
	@Autowired  
    private WorkspaceUsersDao workspaceuserdao; 

	@Override
	public boolean sendInvitation(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return workspaceuserdao.sendInvitation(companyName, userEmailId);
	}

	@Override
	public boolean acceptInvitation(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return workspaceuserdao.acceptInvitation(companyName, userEmailId);
	}

	@Override
	public boolean rejectInvitation(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return workspaceuserdao.rejectInvitation(companyName, userEmailId);
	}

	@Override
	public boolean removeUserFromWorkspace(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return workspaceuserdao.removeUserFromWorkspace(companyName, userEmailId);
	}

}
