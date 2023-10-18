package com.email.proveider.application;

import org.springframework.stereotype.Service;

import com.email.proveider.adapters.EmailSenderGateway;
import com.email.proveider.core.EmailSenderUseCase;

@Service
public class EmailSenderService  implements EmailSenderUseCase{

	private final EmailSenderGateway gateway;
	public EmailSenderService(EmailSenderGateway emailGateway) {
		this.gateway = emailGateway;
	}
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		this.gateway.sendEmail(to, subject, body);
		
	}

}
