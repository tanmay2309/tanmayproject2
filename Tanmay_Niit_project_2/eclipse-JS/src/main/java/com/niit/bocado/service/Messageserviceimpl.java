package com.niit.bocado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.bocado.dao.MessageDao;
import com.niit.bocado.model.Message;
@Service
public class Messageserviceimpl implements Message_service {
	@Autowired  
    private MessageDao messagedao;

	@Override
	public boolean sendMessage(Message message) {
		// TODO Auto-generated method stub
		return messagedao.sendMessage(message);
	}

	@Override
	public List<Message> getMyMessages(String emailId) {
		// TODO Auto-generated method stub
		return messagedao.getMyMessages(emailId);
	}

}
