package day02.topic9;

/**
 * @Author: Sylvia-G
 * @Date: 2020/1/5 21:26
 */
public class Mercedes extends Cars{

    @Override
    protected void driveOn() {
        System.out.println("路上现在跑的是Mercedes");
    }

    @Override
    protected void PriceCount() {
        System.out.println("这是Mercedes的价钱： 999999");
    }
}
