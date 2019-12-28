package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.Test;

/**
 * @author haoc
 */
public class ReflectDemo3 {

  @Test
  public void testMethod3() throws Exception {
    Class<?> clazz = Class.forName("reflect.MethodFuncs");

    Method[] methods = clazz.getMethods();

    for (Method method : methods) {
      String methodName = method.getName();
      if ("sum1".equals(methodName)) {
        Object result = method.invoke(new MethodFuncs(), 3, 5);
        System.out.println(result);
      }
    }
  }

//   @Test
//   public void testMethod2() throws Exception {
//     Class<?> clazz = Class.forName("reflect.MethodFuncs");
//
//     Method sumMethod = clazz.getMethod("sum", Integer.class, Integer.class);
//
//     Object result = sumMethod.invoke(new MethodFuncs(), 3, 5);
//
//     System.out.println(result);
//   }

  @Test
  public void testMethod1() throws Exception {
    Class<?> clazz = Class.forName("reflect.MethodFuncs");

    Method[] methods = clazz.getMethods();

    // MethodFuncs methodFuncs = new MethodFuncs();
    //      ||
    //      \/
//     Object methodFuncs = clazz.newInstance();

    Constructor<?> constructor = clazz.getConstructor(String.class);
    Object methodFuncs = constructor.newInstance("jim");

    for (Method method : methods) {
      if (method.getName().startsWith("foo")) {
        method.invoke(methodFuncs);
      }
    }
  }
}
