package com.weblearner.springboot;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.weblearner.springboot.model.Employee;

@Component
public class QueueConsumer {

	@JmsListener(destination = "myweblearner")
	public void consumer(Employee message) {
		System.out.println("Consumed Message " + message.toString());

	}

}
