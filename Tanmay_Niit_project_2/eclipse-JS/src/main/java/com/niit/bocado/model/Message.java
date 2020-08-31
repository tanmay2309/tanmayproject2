package com.niit.bocado.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Component
public class Message implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int messageId;
	private String messageText;
	@JsonFormat(pattern="dd-mm-yyyy hh:mm:ss")
	private Date sentDate;
	private long messageSize;
	private long maximumSize;
	private String messageType;
	private String receiverEmailId;
	private String circleName;
	
	public Message() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Message(int messageId, String messageText, Date sentDate, long messageSize, long maximumSize,
			String messageType, String receiverEmailId, String circleName) {
		
		this.messageId = messageId;
		this.messageText = messageText;
		this.sentDate = sentDate;
		this.messageSize = messageSize;
		this.maximumSize = maximumSize;
		this.messageType = messageType;
		this.receiverEmailId = receiverEmailId;
		this.circleName = circleName;
	}

	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	public Date getSentDate() {
		return sentDate;
	}
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}
	public long getMessageSize() {
		return messageSize;
	}
	public void setMessageSize(long messageSize) {
		this.messageSize = messageSize;
	}
	public long getMaximumSize() {
		return maximumSize;
	}
	public void setMaximumSize(long maximumSize) {
		this.maximumSize = maximumSize;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getReceiverEmailId() {
		return receiverEmailId;
	}
	public void setReceiverEmailId(String receiverEmailId) {
		this.receiverEmailId = receiverEmailId;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", messageText=" + messageText + ", sentDate=" + sentDate
				+ ", messageSize=" + messageSize + ", maximumSize=" + maximumSize + ", messageType=" + messageType
				+ ", receiverEmailId=" + receiverEmailId + ", circleName=" + circleName + "]";
	}
	
	
	

}
