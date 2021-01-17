package com.rabbitmqreciever;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helloworld_reciever/")
public class HelloWorld_Reciever_Controller {

	Recieve recieve = new Recieve();
	
	@GetMapping(path="/")
	public String getText() {
		recieve.recieving();
		return "Link is working fine.";
	}
}
