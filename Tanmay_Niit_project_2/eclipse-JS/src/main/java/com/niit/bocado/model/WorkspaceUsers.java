
package com.niit.bocado.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.*;

import org.springframework.stereotype.Component;
@Entity
@Component
public class WorkspaceUsers implements Serializable {

public WorkspaceUsers(int workspaceUsersId, String companyName, String userEmailId, char status) {

this.workspaceUsersId = workspaceUsersId;
this.companyName = companyName;
this.userEmailId = userEmailId;
this.status = status;
}
public WorkspaceUsers() {

// TODO Auto-generated constructor stub
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int workspaceUsersId;
private String companyName;
private String userEmailId;
private char status;
public int getWorkspaceUsersId() {
return workspaceUsersId;
}
public void setWorkspaceUsersId(int workspaceUsersId) {
this.workspaceUsersId = workspaceUsersId;
}
public String getCompanyName() {
return companyName;
}
public void setCompanyName(String companyName) {
this.companyName = companyName;
}
public String getUserEmailId() {
return userEmailId;
}
public void setUserEmailId(String userEmailId) {
this.userEmailId = userEmailId;
}
public char getStatus() {
return status;
}
public void setStatus(char status) {
this.status = status;
}
@Override
public String toString() {
return "WorkspaceUsers [workspaceUsersId=" + workspaceUsersId + ", companyName=" + companyName
+ ", userEmailId=" + userEmailId + ", status=" + status + "]";
}


}