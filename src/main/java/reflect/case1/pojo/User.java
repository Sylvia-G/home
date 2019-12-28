package reflect.case1.pojo;

/**
 * @author haoc
 */
public class User {

  private String userId;
  private String userName;

  public String getUserId() {
    return userId;
  }

  public void setUserId(final String userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(final String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("User{");
    sb.append("userId='").append(userId).append('\'');
    sb.append(", userName='").append(userName).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
