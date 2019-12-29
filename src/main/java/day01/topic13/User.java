package day01.topic13;

/**
 *@Author: Sylvia-G
 */
public class User {
    /**
     * 公有属性
     */
    public int age;
    public String name;
    public String school;
    public double fee;
    /**
     * 私有属性, 静态域
     */
    private static int uid=1;

    /**
     * 默认构造方法
     * @param age
     * @param name
     * @param school
     * @param fee
     */
    public User(int age, String name, String school, double fee) {
        this.age = age;
        this.name = name;
        this.school = school;
        this.fee = fee;
    }

    /**
     * 重载1个参数的构造方法
     * @param age
     */
    public User(int age){
        this.age = age;
    }

    /**
     * 重载2个参数的构造方法
     * @param name
     * @param school
     */
    public User(String name, String school){
        this.name = name;
        this.school = school;
    }

    /**
     * 方法, 获取默认属性值
     * @return
     */
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    /**
     * 静态方法
     * @return
     */
    public static int getUid() {
        return uid;
    }

    public double getFee() {
        return fee;
    }


}
