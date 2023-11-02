package com.email.proveider.core.dto;

public class EmaiRequestlRecord {
	
	String to;
	String subject;
	String body;
	
	
	
	@Override
	public String toString() {
		return "EmaiRequestlRecord [to=" + to + ", subject=" + subject + ", body=" + body + "]";
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
