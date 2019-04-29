package com.evelinweb.springrest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.evelinweb.springrest.models.Message;

@RestController
public class MessageController {
	
//	@ResponseBody When using @RestController, the response body can be removed
	@GetMapping("/message")
	Message send() {
		return new Message("first message");
	}
	

	@PostMapping("/message")
	Message echo(@RequestBody Message message) {
		return message;
	}
	
}
