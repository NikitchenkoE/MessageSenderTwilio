package com.example.messagesendertwilio.services;

public interface MessagingService {
    boolean sandMessage(String reciveNumber, String sms);
}
