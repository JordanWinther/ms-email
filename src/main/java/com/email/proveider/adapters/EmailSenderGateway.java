package com.email.proveider.adapters;

public interface EmailSenderGateway {

	void sendEmail(String to, String subject, String body);
}
