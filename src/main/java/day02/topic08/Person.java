package day02.topic08;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/5 20:58
 */
public class Person {
    public String name;
    public int age;
    public int height;
    public String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat(){
        System.out.println("行为: 吃饭");
    }

}
