package com.cloud.stram.controller;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.stream.entity.Message;

@RestController // or @EnableBinding(Sink.class)

public class CloudStreamController {
	
	@StreamListener(Sink.INPUT)
	public void subcriberEvent(Message message) {
		System.out.println(message);
}
}