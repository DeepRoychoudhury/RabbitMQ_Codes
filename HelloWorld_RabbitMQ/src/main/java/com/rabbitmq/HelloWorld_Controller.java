package com.rabbitmq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helloworld/")
public class HelloWorld_Controller {

	Send send = new Send();
	
	@GetMapping(path="/")
	public String getText() {
		send.sending();
		return "Link is working fine.";
	}
}
