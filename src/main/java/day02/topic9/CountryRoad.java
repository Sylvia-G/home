package day02.topic9;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/5 21:45
 */
public class CountryRoad<T> extends Road<T>{

    @Override
    protected void construction() {
        System.out.println("乡村道路的建造方法");
    }

    @Override
    protected void transport(T t) {
        System.out.println("乡村道路跑车车");
    }
}
