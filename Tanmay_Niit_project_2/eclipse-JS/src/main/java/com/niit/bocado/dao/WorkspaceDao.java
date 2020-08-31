package com.niit.bocado.dao;

import java.util.List;

import com.niit.bocado.model.Workspace;

public interface WorkspaceDao {
	boolean createWorkspace(Workspace workspace);
	List<Workspace> getWorkspaceByAdminEmailId(String emailId);

}
