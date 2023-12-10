package com.email.proveider.adapters;

import com.email.proveider.core.Entity.Email;

public interface SalvarEmailGateway {
	Email salvarEmail(String to, String subject, String body);
}
