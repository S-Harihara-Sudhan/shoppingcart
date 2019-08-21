package com.tekvillage.scart.Listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.tekvillage.scart.db.OrderDetails;
import com.tekvillage.scart.db.OrderRepository;

@Component
public class MessageListener {

	@Autowired
	private OrderRepository orderRepository;
	@JmsListener(destination = "scart.queue")
	public void messageListener(OrderDetails order) {
		System.out.println("Received order from Message Queue for user" + order.getUserName());
		orderRepository.save(order);
	}
}
