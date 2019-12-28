package reflect.case1.pojo;

/**
 * @author haoc
 */
public class Response {

  private String errorCode;

  private String errorMsg;

  public Response(final String errorCode, final String errorMsg) {
    this.errorCode = errorCode;
    this.errorMsg = errorMsg;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(final String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(final String errorMsg) {
    this.errorMsg = errorMsg;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Response{");
    sb.append("errorCode='").append(errorCode).append('\'');
    sb.append(", errorMsg='").append(errorMsg).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
