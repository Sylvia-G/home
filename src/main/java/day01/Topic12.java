package day01;

/**
 * 实现一个水仙花数( "水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 )
 */
public class Topic12 {
    public static void main(String[] args) {
//        //负数检查：-153
//        System.out.println("-153是水仙花数:" + shuiXianHua(-153));
//
//        //1位数检查：0-9
//        System.out.println("8是水仙花数:" + shuiXianHua(8));
//
//        //2位数检查：10-99
//        System.out.println("99是水仙花数:" + shuiXianHua(99));
//
//        //3位数检查：100-999
//        System.out.println("100是水仙花数:" + shuiXianHua(100));
//
//        //大于3位数检查：1000
//        System.out.println("1000是水仙花数:" + shuiXianHua(1000));

        //水仙花数检查：153
        System.out.println("153是水仙花数:" + shuiXianHua(153));
    }

    /**
     * 实现0-999内的水仙花数
     * @param num
     * @return
     */
    private static boolean shuiXianHua(int num) {
        int start = 0;
        int end = 999;
        if (num >= start && num <=end){

            int units = num % 10;
            int tens = num / 10 % 10;
            // 同 num / 100 % 10;
            int hundreds = num / 100;
            System.out.println(hundreds);
            double digit = Math.pow(units, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3);

            if (num == digit) {
                return true;
            } else {
                return false;
            }
    }else {
            return false;
        }
    }
}
