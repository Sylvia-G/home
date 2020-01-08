package day02.topic08;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/3 21:37
 */
public class Teacher extends Person{
    public static void main(String[] args) {
        Teacher caseTeacher = new Teacher("小度老师", 32, "男");
        caseTeacher.setHeight(185);
        caseTeacher.setLession("English");

        System.out.println(caseTeacher.toString());

        caseTeacher.teach();
        caseTeacher.eat();
        caseTeacher.forbFun();
    }
    private String lession;

    public Teacher(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getLession() {
        return lession;
    }

    public void setLession(String lession) {
        this.lession = lession;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex='" + sex + '\'' +
                ", lession='" + lession + '\'' +
                '}';
    }

    private void teach(){
        System.out.println("行为: 教课");
    }

    private void forbFun(){
        System.out.println("行为: 禁止把妹");
    }
}
