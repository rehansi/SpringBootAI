package com.integration.Ai.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class ChatGptRequest {

	
	private String model; //which model we want to use of ChatGpt
	private List<Message> messages;  //what is the prompt we want to pass in this message 
	
	
	
	public ChatGptRequest(String model, String prompt) {
		super();
		this.model = model;
		this.messages = new ArrayList<>();
		this.messages.add(new Message("user", prompt));
		
	}
	
	
}
