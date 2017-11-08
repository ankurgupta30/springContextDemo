package ankur.test.spring.context.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ankur.test.spring.context.ManagedBeans.OrderService;
import ankur.test.spring.context.ManagedBeans.UserService;
import ankur.test.spring.context.ManagedBeans.Impl.OrderServiceImpl;
import ankur.test.spring.context.ManagedBeans.Impl.UserServiceImpl;

@Configuration
public class ExampleApp1Config {

	@Bean
	public UserService getUserService(OrderService orderService){
		UserService userService =  new UserServiceImpl(orderService);
		return userService;
	}
	
	@Bean
	public OrderService getOrderService(){
		OrderService orderService =  new OrderServiceImpl();
		return orderService;
	}
	
	
}
