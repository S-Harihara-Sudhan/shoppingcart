package com.tekvillage.scart.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekvillage.scart.db.OrderDetails;

@RestController
@RequestMapping("/scart")
public class OrderController{
	
	@Autowired
	private Queue mqueue;

	@Autowired
	private JmsTemplate messageTemplate;
	
	@PostMapping("/postorder")
	public void postOrder(@RequestBody OrderDetails order) {
		messageTemplate.convertAndSend(mqueue, order);
	}
}