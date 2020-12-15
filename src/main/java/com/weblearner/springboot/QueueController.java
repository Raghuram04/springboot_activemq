package com.weblearner.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weblearner.springboot.model.Employee;


@RestController
@RequestMapping("/weblearner")
public class QueueController {
	
	@Autowired
	private JmsTemplate template;

	@PostMapping("/employee")
	public String newEmployee(@RequestBody Employee employee) {		
		template.convertAndSend("myweblearner", employee);
		return "Success";
	}
}
