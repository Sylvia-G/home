package reflect;
import java.lang.reflect.Field;
import org.junit.Test;

/**
 * @author haoc
 */
public class ReflectDemo4 {

  @Test
  public void testDeclareFields1() throws ClassNotFoundException {
    Class<?> clazz = Class.forName("reflect.Person");

    // Field[] fields = clazz.getFields();
    // for (final Field field : fields) {
    //   System.out.println(field.getName());
    // }

    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(field.getName());
    }
  }

  @Test
  public void testSetFields()
      throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
    Class<?> clazz = Class.forName("reflect.Person");
    Field nameField = clazz.getField("name");

    Object instance = clazz.newInstance();

    System.out.println("instance before:" + instance);

    nameField.set(instance, "张三");

    System.out.println("instance after:" + instance);

    Object nameValue = instance.getClass().getField("name").get(instance);
    System.out.println("field get val:" + nameValue);
  }

  @Test
  public void testSetDeclareFields()
      throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
    Class<?> clazz = Class.forName("reflect.Person");

    // getDeclaredField能够获取私有属性
    Field nameField = clazz.getDeclaredField("amount");

    // 加可访问的权限
    nameField.setAccessible(true);

    Object instance = clazz.newInstance();

    System.out.println("instance before:" + instance);

    nameField.set(instance, 1024);

    System.out.println("instance after:" + instance);

    // 这里为什么报错: java.lang.IllegalAccessException: Class reflect.ReflectDemo4 can not access a member of class reflect.Person with modifiers "private"
//    nameField.setAccessible(true);
//    Object nameValue = instance.getClass().getDeclaredField("amount").get(instance);
//    System.out.println(nameValue);

//    Field[] declaredFields = clazz.getDeclaredFields();
//    for (Field declaredField : declaredFields) {
//      System.out.println(declaredField.getName());
//    }
  }
}
