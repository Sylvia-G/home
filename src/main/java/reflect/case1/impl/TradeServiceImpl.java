package reflect.case1.impl;

import reflect.case1.TradeService;
import reflect.case1.pojo.Response;
import reflect.case1.pojo.Trade;

/**
 * @author haoc
 */
public class TradeServiceImpl implements TradeService {

  @Override
  public Response createTrade(Trade trade) {
    System.out.println("createTrade execute..." + trade);
    return new Response("300", "failed");
  }

}
