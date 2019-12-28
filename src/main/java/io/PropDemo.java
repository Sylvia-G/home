package io;

import java.io.IOException;
import java.util.Properties;

/**
 * @author haoc
 */
public class PropDemo {

  public static void main(String[] args) throws Exception {
    demo1();

    demo02();
  }

  private static void demo02() throws IOException {
    Properties prop = new Properties();

    // 1.这里是绝对路径
    // File propFile = new File("config.properties");
    // prop.load(new FileInputStream(propFile));

    // 2.使用ClassLoader来读取
    prop.load(PropDemo.class.getClassLoader().getResourceAsStream("config.properties"));

    prop.setProperty("name", "jim");

    prop.getProperty("", "");
    System.out.println(prop.getProperty("name"));
  }

  private static void demo1() throws IOException {
    Properties prop = new Properties();

    // 1.这里是绝对路径
    // File propFile = new File("config.properties");
    // prop.load(new FileInputStream(propFile));

    // 2.使用ClassLoader来读取
    prop.load(PropDemo.class.getClassLoader().getResourceAsStream("config.properties"));

    // 3.get->getProperty
    String data = prop.getProperty("driver");

    System.out.println(data);
  }
}
