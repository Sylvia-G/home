package day01.topic1;

import java.math.BigDecimal;

import static day01.topic1.ParamJudge.*;
import static day01.topic1.ParamJudge.requiredStrictNumber;

/**
 * @Author: Sylvia-G
 * @Date: 2019/12/29 15:07
 */
public class Div {
    public static void main(String[] args) {

    }

    /**
     * 提供(相对)精确的除法运算，当除不尽时，精确到小数点后10位， 以后的数字四舍五入
     * @param  v1 被除数
     * @param  v2 除数
     */

    public static String div(String v1, String v2, int scale){
        //判断参数是否为空
        boolean requiredNotBlank = requiredNotBlank(v1,v2);
        if (!requiredNotBlank){
            System.out.println("参数异常, 两个数不可以为空, 不可以为null");
            return null;
        }

        //判断参数长度是否符合
        if (!(requiredLengthLimit(v1,v2))){
            System.out.println("参数异常, 参数长度超过了最大限制");
            return null;
        }

        //校验数值是不是合法
        if (!(requiredCommonsNumeric(v1)) || !(requiredCommonsNumeric(v2))){
            System.out.println("参数不合法");
            return null;
        }

        //判断参数是不是数值
        if (!(requiredStrictNumber(v1))){
            System.out.println("参数"+ v1 + "不是数值");
            return null;
        }
        if (!(requiredStrictNumber(v2))){
            System.out.println("参数"+ v2 + "不是数值");
            return null;
        }

        if (scale<0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal s1 = new BigDecimal(v1);
        BigDecimal s2 = new BigDecimal(v2);
        return s1.divide(s2, scale, BigDecimal.ROUND_HALF_UP).toString();

    }

    public static String div(int va, int vb, int scale){

        String v1 = String.valueOf(va);
        String v2 = String.valueOf(vb);

        //判断参数是否为空
        boolean requiredNotBlank = requiredNotBlank(v1,v2);
        if (!requiredNotBlank){
            System.out.println("参数异常, 两个数不可以为空, 不可以为null");
            return null;
        }

        //判断参数长度是否符合
        if (!(requiredLengthLimit(v1,v2))){
            System.out.println("参数异常, 参数长度超过了最大限制");
            return null;
        }

        //校验数值是不是合法
        if (!(requiredCommonsNumeric(v1)) || !(requiredCommonsNumeric(v2))){
            System.out.println("参数不合法");
            return null;
        }

        //判断参数是不是数值
        if (!(requiredStrictNumber(v1))){
            System.out.println("参数"+ v1 + "不是数值");
            return null;
        }
        if (!(requiredStrictNumber(v2))){
            System.out.println("参数"+ v2 + "不是数值");
            return null;
        }

        if (scale<0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal s1 = new BigDecimal(v1);
        BigDecimal s2 = new BigDecimal(v2);
        return s1.divide(s2, scale, BigDecimal.ROUND_HALF_UP).toString();
    }
}
