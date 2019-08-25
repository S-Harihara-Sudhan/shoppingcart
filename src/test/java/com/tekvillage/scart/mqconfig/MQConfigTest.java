package com.tekvillage.scart.mqconfig;

import static org.junit.Assert.assertEquals;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MQConfigTest {


	
	@Test
	public void  testQueue() {
		assertEquals(new ActiveMQQueue("scart.queue"), new MQConfig().queue());
	}
	
}
