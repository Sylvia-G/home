package day02.topic08;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/3 21:28
 */
public class Student extends Person{

    public static void main(String[] args) {
        Student caseStudent = new Student("小爱童鞋", 20, "男");
        caseStudent.setHeight(180);
        caseStudent.setHobby("swimming");

        System.out.println(caseStudent.toString());

        caseStudent.eat();
        caseStudent.fun();
        caseStudent.study();
    }

    private String hobby;

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    private void study(){
        System.out.println("行为: 学习");
    }

    private void fun(){
        System.out.println("行为: 把妹");
    }
}
