package com.niit.bocado.service;

import java.util.List;

import com.niit.bocado.model.Message;

public interface Message_service {
	boolean sendMessage(Message message);
	List<Message> getMyMessages(String emailId);

}
