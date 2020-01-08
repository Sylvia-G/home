package day02.topic9;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/5 21:44
 */
public class Highway<T> extends Road<T>{

    @Override
    protected void construction() {
        System.out.println("高速公路的建造方法");
    }

    @Override
    protected void transport(T t) {
        System.out.println("高速公路跑车车");
    }
}
