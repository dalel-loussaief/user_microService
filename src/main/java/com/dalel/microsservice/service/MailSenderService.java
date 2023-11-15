package com.dalel.microsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailSenderService {
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(String toEmail,String subject,String body) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("loussaiefdalel15@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		//mailSender.send(message);
		System.out.println("Mail send successfully");
	}
}
