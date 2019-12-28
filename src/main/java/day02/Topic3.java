package day02;

import java.math.BigDecimal;
import java.util.Scanner;

/**
        * 作业3: 实现一个计算器
        *
        * 需求如下:
        *
        * - 1.接收客户端输入(Java核心卷一,第三章,3.7节)的三个数据,格式: 数据1 操作符 数据2,如: 1 + 2
        *
        * - 2.如果数据1和2是数值型,则进行相应的运算符操作
        *
        * - 3.如果数据1和2不是数值型,则将数据1和数据2按字符串处理,与运算符一起拼接后输出,如: abc - bcd,输出"abc-bcd"
        *
        * 备注:
        *
        * - 1.计算器运算符只支持+,-,*,/,%
        *
        * - 2.数据和运算符之间使用空格隔开
        *
        * 要求:
        *
        * - 1.考虑程序的健壮性
        *
        * - 2.自行设计测试用例
        *
        * @author haoc
        */
public class Topic3 {
    public static void main(String[] args) {
        // 3个数据未使用空格分割：1+2  ->提醒输入3个数据, 使用空格分割
        // 3个数据未使用空格分割：1 +2  ->提醒输入3个数据, 使用空格分割
        // 3个数据未使用空格分割：1+ 2  ->提醒输入3个数据, 使用空格分割
        // 输入数据不足3个：1 +     ->提醒输入3个数据, 使用空格分割
        // 数值型int +计算：1 + 2   ->3
        // 数值型string +计算："1" + "2"    ->"1" + "2"
        // 数值型double +计算：1.0 + 2.1    ->3.1
        // 负数相加 +计算：-9 + -10    ->-19
        // 非数值型 +计算：abc - bcd    ->"abc-bcd"
        // -计算, 超大数值：9000000000000000000000000000000000009.1 - 9   ->9000000000000000000000000000000000000.1
        // *计算, 超大数值：1000000000000000000000000000000000001.1 * 5   ->5000000000000000000000000000000000005.5
        // /计算, 超大数值：6000000000000000000000000000000000000 / 3000000000000000000000000000000000000  ->2
        // /计算被除数为0：2 / 0     ->抛出异常, 被除数不能为0
        //  第2个数据非+,-,*,/,%: 1 ( 2      ->提醒第2个数据只接受"+,-,*,/,%"
        testcase();
    }

    public static  void testcase(){
        System.out.println("请输入计算： ");
        Scanner in = new Scanner(System.in);
        String inputs = in.nextLine();
        count(inputs);
    }


    private static void count(String value){
        String[] strs = value.split(" ");
        if (requiredLength(strs)){
            if (requiredOperator(strs[1])){
                if (requiredCommonsNumeric(strs[0]) && requiredCommonsNumeric(strs[2])){
                    BigDecimal d1 = new BigDecimal(strs[0]);
                    BigDecimal d2 = new BigDecimal(strs[2]);
                    if (strs[1].equals("+")){
                        System.out.println(strs[0] + strs[1] + strs[2]+"结果是:"+d1.add(d2).toString());
                    }else if (strs[1].equals("-")){
                        System.out.println(strs[0] + strs[1] + strs[2]+"结果是:"+d1.subtract(d2).toString());
                    }else if (strs[1].equals("*")){
                        System.out.println(strs[0] + strs[1] + strs[2]+"结果是:"+d1.multiply(d2).toString());
                    }else if (strs[1].equals("/")){
                        if (!strs[2].equals("0")){
                            System.out.println(strs[0] + strs[1] + strs[2]+"结果是:"+d1.divide(d2).toString());
                        }else {
                            System.out.println("被除数不能为0");
                        }
                    }else if (strs[1].equals("%")){{
                        System.out.println(strs[0] + strs[1] + strs[2]+"结果是:"+d1.add(d2).toString());
                    }}

                }else {
                    System.out.println(strs[0] + strs[1] + strs[2]);
                }

            }else {
                System.out.println("第2个数据只接受\"+,-,*,/,%\", 如: 1 + 2");
            }
        }else {
            System.out.println("请输入3个数据, 使用空格分割, 如: 1 + 2");
        }


    }

    // 输入校验
    private static  boolean requiredLength(String[] value){
        if (value.length == 3){
            return true;
        }else {
            return false;
        }
    }

    // 操作符校验
    private static  boolean requiredOperator(String value){
        if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/") || value.equals("%")){
            return true;
        }else {
            return false;
        }
    }

    // 操作数值合法性校验
    private static boolean requiredCommonsNumeric(String value){
        //不需要校验非空, 入参已校验
        char[] chars = value.toCharArray();
        for (char ch: chars){
            //数值表示, 一般在0~9之间, 以及小数点
            if (('0'<=ch && ch<='9') || ch=='.'|| ch=='-'){
                continue;
            }else {
                return false;
            }
        }

        return true;
    }
}
