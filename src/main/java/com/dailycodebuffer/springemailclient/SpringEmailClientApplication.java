package com.dailycodebuffer.springemailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailClientApplication {

	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailClientApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		service.sendEmailWithAttachment("arockiamary@boscoits.com",
				"HII SISTER AROCKIA MARY HOW ARE YOU",
				"HERE I ATTACHED MY RESUME FOR YOUR REFERENCE THANK YOU....",
				"C:\\Users\\Bsoft\\Pictures\\Screenshots\\c.png");


		
	}
}