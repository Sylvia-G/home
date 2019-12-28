package day01;

/*
 * 实现一个水仙花数
 */

public class Topic12 {
    public static void main(String[] args) {
        //负数检查：-153
        System.out.println("-153是水仙花数:" + shuixianhua(153));

        //1位数检查：0-9
        System.out.println("8是水仙花数:" + shuixianhua(8));

        //2位数检查：10-99
        System.out.println("99是水仙花数:" + shuixianhua(99));

        //3位数检查：100-999
        System.out.println("100是水仙花数:" + shuixianhua(100));

        //大于3位数检查：1000
        System.out.println("1000是水仙花数:" + shuixianhua(1000));

        //水仙花数检查：153
        System.out.println("153是水仙花数:" + shuixianhua(153));
    }

    private static boolean shuixianhua(int num) {
        if (num >= 0 && num <=999){

            int dafl = num;
            int units = dafl % 10;
            int tens = dafl / 10 % 10;
            int hundreds = dafl / 100 % 10;
            double digitspow = Math.pow(units, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3);

            if (dafl == digitspow) {
                return true;
            } else {
                return false;
            }

    }
        else {
            return false;
        }
    }
}
