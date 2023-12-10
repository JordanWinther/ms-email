package com.email.proveider.core;

import com.email.proveider.core.Entity.Email;

public interface EmailSenderUseCase {

  	Email sendEmail(String to, String subject, String body);
	Email salvarEmail(String to, String subject, String body);
}
