package com.email.proveider.application;

import org.springframework.stereotype.Service;

import com.email.proveider.adapters.EmailSenderGateway;
import com.email.proveider.adapters.SalvarEmailGateway;
import com.email.proveider.core.EmailSenderUseCase;
import com.email.proveider.core.Entity.Email;

@Service
public class EmailSenderService  implements EmailSenderUseCase{

	private final EmailSenderGateway gateway;
	private final SalvarEmailGateway salvar;
	
	public EmailSenderService(EmailSenderGateway emailGateway,SalvarEmailGateway gateWay) {
		this.gateway = emailGateway;
		this.salvar = gateWay;
	}
	
	@Override
	public Email sendEmail(String to, String subject, String body) {
		//this.gateway.sendEmail(to, subject, body);
		return salvarEmail(to, subject, body);
	}

	@Override
	public Email salvarEmail(String to, String subject, String body) {
		return salvar.salvarEmail(to, subject, body);
		
	}

}
