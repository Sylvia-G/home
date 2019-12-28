package reflect.case1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import reflect.case1.annotation.Params;

/**
 * @author haoc
 */
public class CaseHandler {

  private static final String IFACE_CONFIG_FILE = "iface.properties";

  private static final String CASE_BASE_PATH = "cases";

  public static void callCase(String caseTitle, String caseFile) throws Exception {
    // 1.获取接口的配置
    Properties ifaceConfigProp = new Properties();

    // 加载 cases/create_order/iface.properties
    ifaceConfigProp.load(CaseHandler.class.getClassLoader()
        .getResourceAsStream(CASE_BASE_PATH + "/" + caseTitle + "/" + IFACE_CONFIG_FILE));

    // 2.获取case数据的配置
    Properties caseDataProp = new Properties();
    // 加载 cases/create_trade/iface.properties
    caseDataProp.load(CaseHandler.class.getClassLoader()
        .getResourceAsStream(CASE_BASE_PATH + "/" + caseTitle + "/" + caseFile));

    // 获取每个case中的 接口类全名,比如: reflect.case1.impl.TradeServiceImpl
    String ifaceClassName = ifaceConfigProp.getProperty("iface");

    // 获取每个case中的 接口的方法名, 比如: createTrade
    String ifaceMethodName = ifaceConfigProp.getProperty("method");

    // 反射接口类,拿到接口的类对象
    Class<?> ifaceClazz = Class.forName(ifaceClassName);

    Method ifaceMethod = ifaceClazz.getMethod(ifaceMethodName, getParamTypes(ifaceConfigProp));
    System.out.println("测试输出: " + ifaceMethod);

    List<Object> paramObjects = new ArrayList<>();

    Parameter[] parameters = ifaceMethod.getParameters();
    for (Parameter parameter : parameters) {
      Class<?> paramType = parameter.getType();
      if (paramType.isAssignableFrom(String.class)) {
        Params params = parameter.getAnnotation(Params.class);
        String paramKey = params.value();
        String val = caseDataProp.getProperty(paramKey);
        paramObjects.add(val);
        continue;
      }

      // TODO, Long,Integer,Boolean,Short,Char,Integer

      Object paramInstance = paramType.newInstance();

      String selfTypeName = paramType.getSimpleName();

      Field[] fields = paramType.getDeclaredFields();

      for (Field field : fields) {
        String fieldName = field.getName();
        String val = caseDataProp.getProperty(selfTypeName + "." + fieldName);
        field.setAccessible(true);
        field.set(paramInstance, val);
      }

      paramObjects.add(paramInstance);
    }

    Object ifaceInstance = ifaceClazz.newInstance();

    ifaceMethod.invoke(ifaceInstance, paramObjects.toArray());
  }

  private static Class[] getParamTypes(Properties ifaceConfigProp) {
    String paramsList = ifaceConfigProp.getProperty("params");
    String[] paramClassNameArr = paramsList.split(",");
    List<Class> clazzs = new ArrayList<>();
    for (String className : paramClassNameArr) {
      try {
        Class<?> aClass = Class.forName(className);
        clazzs.add(aClass);
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    }
    return clazzs.toArray(new Class[0]);
  }
}
