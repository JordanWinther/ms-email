package com.email.proveider.infra;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.email.proveider.adapters.EmailSenderGateway;
import com.email.proveider.core.exceptions.ErrorMailSenderException;

import jakarta.mail.Address;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Component
public class JavaMailSender  implements EmailSenderGateway{

	
	Properties props;
	private String user = "jordaneinther@gmail.com";
	private String password="C*re2quad;";
	
	public JavaMailSender(Properties properties) {
		this.props = properties;
		 
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "465");
	   
	}
	
	@Override
	public void sendEmail(String destinatary, String subject, String body)  {
		
		Session session = Session.getDefaultInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		} );
		
		/** Ativa Debug para sessão */
	    session.setDebug(true);
	    
	    try {
	    	Message message = new MimeMessage(session);
	    	
	    	message.setFrom(new InternetAddress(user));  //Remetente

	        Address[] destinatarys= InternetAddress.parse(destinatary); // .parse("seuamigo@gmail.com, seucolega@hotmail.com,  seuparente@yahoo.com.br");
	                  
	        message.setRecipients(Message.RecipientType.TO, destinatarys);
	        message.setSubject(subject);//Assunto
	        message.setText(body);
		 
	        Transport.send(message);  /**Método para enviar a mensagem criada*/
	       
	        System.out.println("Feito!!!");
	    	
	        
	      
	        
	        } catch (AddressException a) {
	            // Tratar exceção de endereço de email
	            throw new ErrorMailSenderException("Erro ao enviar e-mail", a.getCause());
	        } catch (MessagingException m) {
	            // Tratar exceção de mensagens
	            throw new ErrorMailSenderException("Erro ao enviar e-mail");
	        } catch (Exception e) {
	            // Tratar exceção genérica
	            throw new ErrorMailSenderException("Erro ao enviar e-mail",e.getCause());

	        
	    }
			
	    
	}//Fim do método

}
	

	
