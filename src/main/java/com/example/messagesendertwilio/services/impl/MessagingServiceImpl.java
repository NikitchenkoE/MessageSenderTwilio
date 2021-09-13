package com.example.messagesendertwilio.services.impl;

import com.example.messagesendertwilio.constans.ConstansTwilio;
import com.example.messagesendertwilio.services.MessagingService;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MessagingServiceImpl implements MessagingService {

    public static final String ACCOUNT_SID = ConstansTwilio.ACCOUNT_SID.getValue();
    public static final String AUTH_TOKEN = ConstansTwilio.AUTH_TOKEN.getValue();
    public static final String PHONE_NUMBER = ConstansTwilio.PHONE_NUMBER.getValue();

    @Override
    public boolean sandMessage(String reciveNumber, String sms) {
        log.info(String.format("Sent message to %s from %s with text %s", reciveNumber, PHONE_NUMBER, sms));
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber(reciveNumber), new PhoneNumber(PHONE_NUMBER), sms).create();
        System.out.println(message.getSid());
        return true;
    }
}
