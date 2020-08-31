package com.niit.bocado.dao;

import java.util.List;

import com.niit.bocado.model.UserMessage;

public interface UserMessageDao {
boolean sendMessage(UserMessage usrmessage);
boolean deleteMessage(int messageId);
List<UserMessage> getMyMessages(String emailId);
List<UserMessage> getAllMessageByCircleName(String circleName);
public boolean isRecieverExists(String recieverEmailId);
public boolean isCircleExists(String circleName);
List<UserMessage> getAllMessageByUser(String senderEmailId,String receiverEmailId);


}
