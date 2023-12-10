package com.email.proveider.application;

import org.springframework.stereotype.Service;

import com.email.proveider.adapters.EmailSenderGateway;
import com.email.proveider.adapters.SalvarEmailGateway;
import com.email.proveider.core.EmailSenderUseCase;

@Service
public class EmailSenderService  implements EmailSenderUseCase{

	private final EmailSenderGateway gateway;
	private final SalvarEmailGateway salvar;
	
	public EmailSenderService(EmailSenderGateway emailGateway,SalvarEmailGateway gateWay) {
		this.gateway = emailGateway;
		this.salvar = gateWay;
	}
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		//this.gateway.sendEmail(to, subject, body);
		salvarEmail(to, subject, body);
	}

	@Override
	public void salvarEmail(String to, String subject, String body) {
		this.salvar.salvarEmail(to, subject, body);
		
	}

}
