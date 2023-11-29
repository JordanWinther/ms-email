package com.email.proveider.core;

public interface EmailSenderUseCase {

	void sendEmail(String to, String subject, String body);
	void salvarEmail(String to, String subject, String body);
}
