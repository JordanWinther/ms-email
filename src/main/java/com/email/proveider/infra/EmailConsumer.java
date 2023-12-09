package com.email.proveider.infra;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

	@RabbitListener(queues ="default.email")
	public void ListenEmailQueue(@Payload String payload) {
		System.out.print(payload);
	}
}
