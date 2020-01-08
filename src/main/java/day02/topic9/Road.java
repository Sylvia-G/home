package day02.topic9;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/5 21:42
 */
public abstract class Road<T> {

    /**
     * 不同的路有不同的建造方法
     */
    protected abstract void construction();

    /**
     * 车跑在不同的路上会有不同的表现
     */
    protected abstract void transport(T t);

}
