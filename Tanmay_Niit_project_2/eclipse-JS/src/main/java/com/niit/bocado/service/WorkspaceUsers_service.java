package com.niit.bocado.service;

public interface WorkspaceUsers_service {

boolean sendInvitation(String companyName,String userEmailId);
boolean acceptInvitation(String companyName,String userEmailId);
boolean rejectInvitation(String companyName,String userEmailId);
boolean removeUserFromWorkspace(String companyName,String userEmailId);
}
