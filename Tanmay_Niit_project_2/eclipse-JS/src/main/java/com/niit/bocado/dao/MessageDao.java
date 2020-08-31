package com.niit.bocado.dao;

import java.util.List;

import com.niit.bocado.model.Message;

public interface MessageDao {
	boolean sendMessage(Message message);
	List<Message> getMyMessages(String emailId);

}
