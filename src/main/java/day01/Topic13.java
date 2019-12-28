package day01;

/**
 * 13.基于面向对象的预习，定义一个类User，要求具备：
 * - a.有私有的属性
 * - b.有公开的属性
 * - c.有默认的构造方法
 * - d.有重载1个和2个参数的构造方法
 * - e.有方法，只需实现获取属性值即可
 * - f.有类属性(静态域）
 * - g.有类方法(静态方法）
 * - h.对User对象进行实例化，并调用其方法(e步骤实现），获取属性值*/
public class Topic13 {
    //实例化User对象, 并调用方法
    User user = new User(20,"水间","北京大学", 20000);
    int uage = user.getAge();
    String uname = user.getName();
    String ushool = user.getSchool();
    double ufee = user.getFee();
}
