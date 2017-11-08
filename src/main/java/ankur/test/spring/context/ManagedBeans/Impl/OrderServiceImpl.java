package ankur.test.spring.context.ManagedBeans.Impl;

import java.util.Arrays;
import java.util.List;

import ankur.test.spring.context.ManagedBeans.OrderService;

public class OrderServiceImpl implements OrderService {

	public List<Integer> getOrders() {
		// Hardcoded
		return Arrays.asList(1,2,3);
	}

}
