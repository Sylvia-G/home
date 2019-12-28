package reflect.case1;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @author haoc
 */
public class AppCreateOrder {

  public static void main(String[] args) throws Exception {
    // case 1,
    CaseOneArgHandler.callCase("create_order", "case1.properties");
    CaseOneArgHandler.callCase("create_order", "create_order2.properties");
    CaseOneArgHandler.callCase("create_order", "create_order3.properties");
    CaseOneArgHandler.callCase("create_order", "create_order4.properties");

  }

}
