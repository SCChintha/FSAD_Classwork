package com.klu.model;

import com.klu.service.MessageService;

public class Message {
	private String text;
	public Message(String text) {
		this.text=text;
	}
	public String getText() {
		return text;
	}
}
