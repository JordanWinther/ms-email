package com.email.proveider.infra;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.email.proveider.core.dto.EmailRecordDto;

@Component
public class EmailConsumer {
	
	 static String fila = "default.email";

	@RabbitListener(queues = fila)
	public void ListenEmailQueue(@Payload EmailRecordDto payload) {
		System.out.print(payload);
	}
}
