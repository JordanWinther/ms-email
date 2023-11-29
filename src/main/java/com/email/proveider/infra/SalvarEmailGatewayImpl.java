package com.email.proveider.infra;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.email.proveider.adapters.SalvarEmailGateway;
import com.email.proveider.core.Entity.Email;

@Component
public class SalvarEmailGatewayImpl implements SalvarEmailGateway {

	private  SalvarEmailRepository emailRepository;
	
	SalvarEmailGatewayImpl(SalvarEmailRepository email){
		this.emailRepository = email;
	}
	@Override
	public void salvarEmail(String to, String subject, String body) {
	  var email = new Email(to, subject, body);
	 
		emailRepository.save(email);
		
		
	}

}
