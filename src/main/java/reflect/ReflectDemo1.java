package reflect;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author haoc
 */
public class ReflectDemo1 {

  @Test
  public void testConsutrcutor() throws ClassNotFoundException {
    Class<?> clazz=Class.forName("reflect.Person");
    Constructor<?>[] constructors = clazz.getConstructors();
    for (Constructor<?> constructor : constructors) {
      System.out.println(constructor);
    }
  }

  @Test
  public void testAnnotation() throws ClassNotFoundException {
    Class<?> clazz = Class.forName("reflect.Person");
    Annotation[] annotations = clazz.getAnnotations();
    for (Annotation annotation : annotations) {
      System.out.println(annotation);
    }
  }

  @Test
  public void testMethod() throws Exception {
    Class<?> clazz = Class.forName("reflect.Person");
    Method[] methods = clazz.getMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
    }
  }

  @Test
  public void testField() throws Exception {
    // 基于Class找到类
    Class<?> clazz = Class.forName("reflect.Person");

    // 获取类的字段
    Field ageField = clazz.getField("age");
    // 看一下字段的名字
    String fieldName = ageField.getName();
    System.out.println(fieldName);
    System.out.println("-----");

    Field[] fields = clazz.getFields();
    for (Field field : fields) {
      System.out.println(field.getName());
    }
    System.out.println("-----");

    Field[] declaredFields = clazz.getDeclaredFields();
    for (Field declaredField : declaredFields) {
      System.out.println(declaredField.getName());
    }


  }



}
