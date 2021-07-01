package com.accolite.course.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.accolite.course.models.MailSender;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender emailSender;
	
	public void sendEmailviaMailSender(MailSender mailsender) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(mailsender.getMail());
		message.setSubject(mailsender.getSubject());
		message.setText(mailsender.getBody()); 
		try
		{
			emailSender.send(message);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
	}
}
