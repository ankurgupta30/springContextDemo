package ankur.test.spring.context.ManagedBeans.Impl;

import java.util.List;

import ankur.test.spring.context.ManagedBeans.OrderService;
import ankur.test.spring.context.ManagedBeans.UserService;

public class UserServiceImpl implements UserService {

	private OrderService orderService;
	
	public UserServiceImpl(OrderService orderService){
		this.orderService = orderService;
	}
	
	public String getUserName() {
		//Hardcoded Implementation
		return "Ankur Gupta";
	}
	
	public List<Integer> getOrders() {
		return orderService.getOrders();
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	
}
