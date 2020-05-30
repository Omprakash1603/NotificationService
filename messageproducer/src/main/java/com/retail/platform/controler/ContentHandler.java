package com.retail.platform.controler;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.retail.platform.model.Content;

@Service
public class ContentHandler {
	private static final Logger log = LoggerFactory.getLogger(ContentHandler.class);

	@Autowired
	KafkaTemplate<String, Content> kafkaContentTemplate;

	@Value("${kafka.topic.name.content}")
	private String KAFKA_TOPIC_CONTENT;

	public String publishContent(@Valid Content content) {
		kafkaContentTemplate.send(KAFKA_TOPIC_CONTENT, content);
		log.info("Streaming Content payload successfully sent in Kafka queue: ");
		return "Published Successfully!";
	}

}
