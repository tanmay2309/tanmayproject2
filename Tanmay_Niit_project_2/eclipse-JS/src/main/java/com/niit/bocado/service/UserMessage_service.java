package com.niit.bocado.service;

import java.util.List;

import com.niit.bocado.model.User;
import com.niit.bocado.model.UserMessage;

public interface UserMessage_service{
boolean sendMessage(UserMessage usrmessage);
boolean deleteMessage(int messageId);
List<UserMessage> getMyMessages(String emailId);
List<UserMessage> getAllMessageByCircleName(String circleName);
boolean isReceiverExists(String receiverEmailId);
boolean isCircleExists(String circleName);
List<UserMessage> getAllMessageByUsers(String senderEmailId,String receiverEmailId);



}
