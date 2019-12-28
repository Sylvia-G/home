package reflect.case1.pojo;

/**
 * @author haoc
 */
public class Order {

  private String orderId;
  private String userId;
  private String amount;

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(final String orderId) {
    this.orderId = orderId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(final String userId) {
    this.userId = userId;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(final String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Order{");
    sb.append("orderId='").append(orderId).append('\'');
    sb.append(", userId='").append(userId).append('\'');
    sb.append(", amount=").append(amount);
    sb.append('}');
    return sb.toString();
  }
}
