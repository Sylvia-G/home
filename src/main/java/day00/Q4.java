package day00;//编程: 随机id生成器
//随机id要求:
//        32位
//        前4位是230_
//        随后14位是yyyyMMddHHmmss
//        随后10位是随机数字
//            随机数字最后一位是奇数, 则后4位用1100补齐32位
//            随机数字最后一位是偶数, 则后4位用2200补齐32位
//需考虑多线程场景
//要求: 考虑健壮性

public class Q4 {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

    }
}


