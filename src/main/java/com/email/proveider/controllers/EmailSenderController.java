package com.email.proveider.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.proveider.application.EmailSenderService;
import com.email.proveider.core.dto.EmaiRequestlRecord;
import com.email.proveider.core.exceptions.ErrorMailSenderException;
import com.email.proveider.infra.JavaMailSender;

@RestController
@RequestMapping("/ms/email")
public class EmailSenderController {
	
	private final EmailSenderService emailSenderService;
	 public EmailSenderController( EmailSenderService service ) {
		this.emailSenderService = service;
	}

	@PostMapping
	public ResponseEntity<Object> sendEmail( @RequestBody @Validated  EmaiRequestlRecord email){
		try {
			emailSenderService.sendEmail( email.getTo(), email.getSubject(), email.getBody());
			
			return  ResponseEntity.ok(email);
		} catch (ErrorMailSenderException e) {
			
			return ResponseEntity
					.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(	new ErrorMailSenderException("Error while sending e-mail", e.getCause()) );
			
		}
		
		
	}
	
	
	
}
