package com.kaf.apachekafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaf.apachekafka.services.KafkaProducer;
import com.kaf.vo.MessageVO;

@RestController
@RequestMapping(value="/kafka")
public class WebRestController {
	
	@Autowired
	KafkaProducer producer;
	
	@PostMapping(value="/producer")
	public String producer(@RequestBody MessageVO message){
		producer.sendMessageFromProducer(message);
		return "Produced Data Successfully";
	}
	
}
