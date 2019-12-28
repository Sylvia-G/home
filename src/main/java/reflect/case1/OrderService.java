package reflect.case1;

import reflect.case1.pojo.Order;
import reflect.case1.pojo.Response;

/**
 * @author haoc
 */
public interface OrderService{

  Response createOrder(Order order);

  Response queryOrder(Order order);

  Response updateOrder(Order order);
}
