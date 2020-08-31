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
public class UserMessage implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int messageId;
	private String messageText;
	private String senderEmailId;
	//@JsonFormat(pattern="dd-mm-yyyy hh:mm:ss")
	private Date sentDate;
	private long messageSize;
	private String messageType;
	private String receiverEmailId;
	private String circleName;
	public UserMessage() {
		
		// TODO Auto-generated constructor stub
	}
	public UserMessage(int messageId, String messageText, String senderEmailId, Date sentDate, long messageSize,
			String messageType, String receiverEmailId, String circleName) {
		
		this.messageId = messageId;
		this.messageText = messageText;
		this.senderEmailId = senderEmailId;
		this.sentDate = sentDate;
		this.messageSize = messageSize;
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
	public String getSenderEmailId() {
		return senderEmailId;
	}
	public void setSenderEmailId(String senderEmailId) {
		this.senderEmailId = senderEmailId;
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
		return "UserMessage [messageId=" + messageId + ", messageText=" + messageText + ", senderEmailId="
				+ senderEmailId + ", sentDate=" + sentDate + ", messageSize=" + messageSize + ", messageType="
				+ messageType + ", receiverEmailId=" + receiverEmailId + ", circleName=" + circleName + "]";
	}
	
	
	
	
}
