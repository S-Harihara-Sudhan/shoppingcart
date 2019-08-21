package com.tekvillage.scart.db;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderDetails, String> {

}
