package com.niit.bocado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.bocado.dao.WorkspaceDao;
import com.niit.bocado.model.Workspace;
@Service
public class Workspaceserviceimpl implements Workspace_service {
	@Autowired  
    private WorkspaceDao workspacedao; 
	@Override
	public boolean createWorkspace(Workspace workspace) {
		// TODO Auto-generated method stub
		return workspacedao.createWorkspace(workspace);
	}

	@Override
	public List<Workspace> getWorkspaceByAdminEmailId(String emailId) {
		// TODO Auto-generated method stub
		return workspacedao.getWorkspaceByAdminEmailId(emailId);
	}

}