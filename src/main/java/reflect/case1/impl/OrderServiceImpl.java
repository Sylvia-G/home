package reflect.case1.impl;

import reflect.case1.annotation.Params;
import reflect.case1.pojo.Order;
import reflect.case1.pojo.Response;
import reflect.case1.pojo.User;

/**
 * @author haoc
 */
public class OrderServiceImpl /*implements OrderService*/ {

  // @Override
  public Response createOrder(Order order) {
    System.out.println("createOrder execute..." + order);
    return new Response("200", "success");
  }

  // @Override
  public Response queryOrder(@Params("orderId") String orderId, User user, Order order) {
    System.out.println("queryOrder execute... orderId:" + orderId);
    System.out.println("queryOrder execute...order:" + order);
    System.out.println("queryOrder execute...user:" + user);
    return new Response("200", "success");
  }

  // @Override
  public Response updateOrder(Order order) {
    System.out.println("updateOrder execute..." + order);
    return new Response("200", "success");
  }
}
