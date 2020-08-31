package com.niit.bocado.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity  
@Component
public class Workspace implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int workspaceId;
	private String purpose;
	private int teamSize;
	private String role;
	private String comanyName;
	private String adminEmailId;
	private Date creationDate;
	public Workspace() {
		
		// TODO Auto-generated constructor stub
	}
	public Workspace(int workspaceId, String purpose, int teamSize, String role, String comanyName, String adminEmailId,
			Date creationDate) {
		
		this.workspaceId = workspaceId;
		this.purpose = purpose;
		this.teamSize = teamSize;
		this.role = role;
		this.comanyName = comanyName;
		this.adminEmailId = adminEmailId;
		this.creationDate = creationDate;
	}
	public int getWorkspaceId() {
		return workspaceId;
	}
	public void setWorkspaceId(int workspaceId) {
		this.workspaceId = workspaceId;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getComanyName() {
		return comanyName;
	}
	public void setComanyName(String comanyName) {
		this.comanyName = comanyName;
	}
	public String getAdminEmailId() {
		return adminEmailId;
	}
	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "Workspace [workspaceId=" + workspaceId + ", purpose=" + purpose + ", teamSize=" + teamSize + ", role="
				+ role + ", comanyName=" + comanyName + ", adminEmailId=" + adminEmailId + ", creationDate="
				+ creationDate + "]";
	}
	
}
