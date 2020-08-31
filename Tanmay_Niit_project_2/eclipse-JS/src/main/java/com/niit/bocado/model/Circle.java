package com.niit.bocado.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity  
@Component
public class Circle implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int circleId;
	@Column(name="circleName")
	private String circleName;
	@Column(name="creditedBy")
	private String createdBy;
	private boolean status;
	@Column(name="creationDate")
	@JsonFormat(pattern="dd-mm-yyyy hh:mm:ss")
	private Date creationDate;
	
	public Circle() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int circleId, String circleName, String createdBy, boolean status, Date creationDate) {
		
		this.circleId = circleId;
		this.circleName = circleName;
		this.createdBy = createdBy;
		this.status = status;
		this.creationDate = creationDate;
	}

	public int getCircleId() {
		return circleId;
	}
	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@Override
	public String toString() {
		return "Circle [circleId=" + circleId + ", circleName=" + circleName + ", createdBy=" + createdBy + ", status="
				+ status + ", creationDate=" + creationDate + "]";
	}
	
	
	

}
