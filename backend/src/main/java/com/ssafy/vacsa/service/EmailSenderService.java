package com.ssafy.vacsa.service;

import org.springframework.mail.SimpleMailMessage;

public interface EmailSenderService {
    void sendEmail(SimpleMailMessage email)throws  Exception;
}
