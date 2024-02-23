package com.integration.Ai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

	private String role; //This field refers to the one who is accessing it
	private String content; //prompt
}
