package com.tekvillage.scart.mqconfig;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

@EnableJms
@Configuration
public class MQConfig {

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("scart.queue");
	}
	
}
