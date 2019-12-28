package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.junit.Test;

/**
 * @author haoc
 */
public class ReflectDemo2 {

  @Test
  public void testMethod() throws Exception {
    // new Person().sayHello();


//    Class<?> clazz = Class.forName("reflect.Person");
//
//    Method helloMethod = clazz.getMethod("sayHello");
//
//    helloMethod.invoke(new Person());


    Class<?> aClass = Class.forName("reflect.Person");
    Method sayHello = aClass.getMethod("sayHello");

    Constructor<?> constructor = aClass.getConstructor();
    Object obj = constructor.newInstance();

    sayHello.invoke(obj);
  }
}
