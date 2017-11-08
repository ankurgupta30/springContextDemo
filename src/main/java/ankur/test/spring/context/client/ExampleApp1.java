package ankur.test.spring.context.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ankur.test.spring.context.ManagedBeans.OrderService;
import ankur.test.spring.context.ManagedBeans.UserService;
import ankur.test.spring.context.config.ExampleApp1Config;

public class ExampleApp1 {

	public static void main(String[] str){
		new ExampleApp1().testSpringConfiguration();
	}

	private void testSpringConfiguration() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ExampleApp1Config.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println("User Name "  + userService.getUserName());
		System.out.println("Orders "  + userService.getOrders());
		
		OrderService orderService = context.getBean(OrderService.class);
		System.out.println("User Name "  + orderService.getOrders());
		
	}
}
