package com.email.proveider.core.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "EMAIL") // Nome da tabela no banco de dados
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String destinatary;
    private String subject;
    private String body;
    
    
    
    
    
	public Email(String to, String subject, String body) {
		super();
		this.setDestinatary(to);
		this.subject = subject;
		this.body = body;
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

	public String getDestinatary() {
		return destinatary;
	}

	public void setDestinatary(String destinatary) {
		this.destinatary = destinatary;
	}

}
