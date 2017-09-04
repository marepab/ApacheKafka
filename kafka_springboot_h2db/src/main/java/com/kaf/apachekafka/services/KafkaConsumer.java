package com.kaf.apachekafka.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.kaf.apachekafka.storage.MessageEntity;
import com.kaf.apachekafka.storage.MessageRepository;
import com.kaf.vo.MessageVO;


@Component
public class KafkaConsumer {
	private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	private MessageRepository messageRepository;
	
	@KafkaListener(topics = "${kafka.topic}", containerFactory = "messageKafkaListenerContainerFactory")
    public void messageListener(MessageVO message) {
		log.info("Recieved message: " + message);
		MessageEntity messageEntity = new MessageEntity();
		messageEntity.setCustomerId(message.getCustomerId());
		messageEntity.setField1(message.getField1());
		messageEntity.setField2(message.getField2());
		messageEntity.setField3(message.getField3());
		messageEntity.setField4(message.getField4());
		messageEntity.setField5(message.getField5());
		messageEntity.setField6(message.getField6());
		messageEntity.setPhoneNo(message.getPhoneNo());
		messageEntity.setSourceName(message.getSourceName());
		//push this message to db
		messageRepository.saveAndFlush(messageEntity);
		log.info("message saved successfully to database");
		log.info(messageRepository.getByCustomerId(message.getCustomerId()).toString());
		
    }
}
