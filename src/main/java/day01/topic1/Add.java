package day01.topic1;
/**1
 .使用BigDecimal写一个计算器, 实现加减乘除, 考虑可能是很大的数值计算场景
 * */

import java.math.BigDecimal;
import static day01.topic1.ParamJudge.*;
import org.junit.Test;

/**
 * @Author: Sylvia-G
 */
public class Add {

    @Test
    public void test(){
        System.out.println(add("987.00","0.456"));
        System.out.println(add("123","-123"));
        System.out.println(add("123","1-23"));

        //case03, 边界测试, 长度9
        System.out.println(add("111111111","111111111"));
        //case4, 边界测试, 长度8
        System.out.println(add("11111111","11111111"));
        //case5 边界测试, 长度7
        System.out.println(add("1111111","1111111"));
        //case6, 浮点数, 超长测试
        System.out.println(add(
                "1.00000000000000000000000000000000000000000000000000000",
                "1.00000000000000000000000000000000000000000000000000000"));
        //case7, 浮点数大数测试, 大于0
        System.out.println(add(
                "0.100000000000000000000000000000000000000000000000000000",
                "0.100000000000000000000000000000000000000000000000000000"));
        //case8, 浮点数大数, 小于0
        System.out.println(add(
                "0.00000000000000000000000000000000000000000000000000001",
                "0.00000000000000000000000000000000000000000000000000001"));
        //case9, 0相加
        System.out.println(add("0","0"));
        //case10, 第一个参数非数字
        System.out.println(add("a","123"));
        //case11, 第二个参数非数字
        System.out.println(add("213","b"));
        //case12, 第一个参数为空串
        System.out.println(add("","123"));
        //case13, 第二个参数为空串
        System.out.println(add("34534",""));
        //case14, 第一个参数为null
        System.out.println(add(null,"123"));
        //case15, 第二个参数为null
        System.out.println(add("234354",null));
        //case17, 第二个参数异常
        System.out.println(add("2378","1--23"));
        //case18, 异常数值
        System.out.println(add(".789","123"));
        //case19, 异常数值
        System.out.println(add("7.8.9","123"));
        //case20, 异常数值
        System.out.println(add("789.","123"));
        //case21, 异常数值
        System.out.println(add("789",".123"));
        //case22, 异常数值
        System.out.println(add("789","1.2.3"));
        //case23, 异常数值
        System.out.println(add("987.00","0.456"));
    }


    /**
     *提供加法运算
     * @param v1 被加数
     * @param v2 加数
     * 健壮性考虑: 参数判断(非空/非数值/超长/不同类型[String/Double])、参数计算(整型/浮点型/大数)
     */
    private static String add(String v1, String v2){
        //参数判断-非空
        boolean requiredNotBlank = requiredNotBlank(v1,v2);
        if (!requiredNotBlank){
            System.out.println("参数异常, 两个数不可以为空, 不可以为null");
            return null;
        }

        //参数判断-非数值
        if (!(requiredStrictNumber(v1)) || !(requiredStrictNumber(v2))){
            System.out.println("参数不是数值");
            return null;
        }

        //参数判断：是否超长
        if (!(requiredLengthLimit(v1,v2))){
            System.out.println("参数异常, 参数长度超过了最大限制");
            return null;
        }

        //参数判断: 校验数值是否合法
        if (!(requiredCommonsNumeric(v1)) || !(requiredCommonsNumeric(v2))){
            System.out.println("参数不合法");
            return null;
        }

        //初始化BigDecimal对象时, 传参最好用string(可以看代码, 也可以看网上资料)
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.add(b2).toString();

        }
    }






