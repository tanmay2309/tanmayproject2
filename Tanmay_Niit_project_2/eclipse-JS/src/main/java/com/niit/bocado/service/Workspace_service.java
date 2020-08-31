package com.niit.bocado.service;

import java.util.List;

import com.niit.bocado.model.Workspace;

public interface Workspace_service {
	boolean createWorkspace(Workspace workspace);
	List<Workspace> getWorkspaceByAdminEmailId(String emailId);

}
