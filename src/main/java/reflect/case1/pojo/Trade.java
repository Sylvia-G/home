package reflect.case1.pojo;

/**
 * @author haoc
 */
public class Trade {

  private String tradeId;
  private String orderId;
  private String amount;

  public String getTradeId() {
    return tradeId;
  }

  public void setTradeId(final String tradeId) {
    this.tradeId = tradeId;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(final String orderId) {
    this.orderId = orderId;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(final String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Trade{");
    sb.append("tradeId='").append(tradeId).append('\'');
    sb.append(", orderId='").append(orderId).append('\'');
    sb.append(", amount=").append(amount);
    sb.append('}');
    return sb.toString();
  }
}
