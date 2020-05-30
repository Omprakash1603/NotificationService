package com.retail.platform.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.retail.platform.model.Content;

@Configuration
@EnableKafka
public class KafkaConsumerConfig {

	@Value("${kafka.server.address.port}")
	private String kafkaServerPort;

	@Bean
	public ConsumerFactory<String, Content> consumerFactoryContent() {
		Map<String, Object> consumerConfig = new HashMap<>();
		consumerConfig.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaServerPort);
		consumerConfig.put(ConsumerConfig.GROUP_ID_CONFIG, "group_json");
		consumerConfig.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		consumerConfig.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);

		return new DefaultKafkaConsumerFactory<>(consumerConfig, new StringDeserializer(),
				new JsonDeserializer<>(Content.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Content> kafkaListnerContainerFactoryContent() {
		ConcurrentKafkaListenerContainerFactory<String, Content> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactoryContent());
		return factory;
	}

}
