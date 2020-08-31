package com.niit.bocado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.bocado.dao.UserMessageDao;
import com.niit.bocado.model.UserMessage;
@Service
public class UserMessageserviceimpl implements UserMessage_service {
	@Autowired  
    private UserMessageDao usermessagedao; 

	@Override
	public boolean sendMessage(UserMessage usermessage) {
		// TODO Auto-generated method stub
		return usermessagedao.sendMessage(usermessage);
	}

	@Override
	public boolean deleteMessage(int messageId) {
		// TODO Auto-generated method stub
		return usermessagedao.deleteMessage(messageId);
	}

	@Override
	public List<UserMessage> getMyMessages(String emailId) {
		// TODO Auto-generated method stub
		return usermessagedao.getMyMessages(emailId);
	}

	@Override
	public List<UserMessage> getAllMessageByCircleName(String circleName) {
		// TODO Auto-generated method stub
		return usermessagedao.getAllMessageByCircleName(circleName);
	}

	@Override
	public boolean isReceiverExists(String receiverEmailId) {
		// TODO Auto-generated method stub
		return usermessagedao.isRecieverExists(receiverEmailId);
	}

	@Override
	public boolean isCircleExists(String circleName) {
		// TODO Auto-generated method stub
		return usermessagedao.isCircleExists(circleName);
	}

	@Override
	public List<UserMessage> getAllMessageByUsers(String senderEmailId,String receiverEmailId) {
		// TODO Auto-generated method stub
		return usermessagedao.getAllMessageByUser(senderEmailId, receiverEmailId);
	}

}