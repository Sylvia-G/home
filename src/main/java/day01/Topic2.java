package day01;

import org.junit.Test;
import java.math.BigDecimal;
import static day01.topic1.ParamJudge.*;

/**
 * @Author: Sylvia-G
 */
public class Topic2 {

    @Test
    public void test1(){
        //String测试
        System.out.println(add("123", "456"));
        //double测试
        System.out.println(add(123.0, 456.00));

    }

    /**
     *提供加法运算
     * @param v1 String类型, 被加数
     * @param v2 String类型, 加数
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

    /**
     *提供加法运算
     * @param v1 Double类型, 被加数
     * @param v2 Double类型, 加数
     * 健壮性考虑: 参数判断(非空/非数值/超长/不同类型[String/Double])、参数计算(整型/浮点型/大数)
     */
    private static String add(double v1, double v2){
        //double转String
        String va = Double.toString(v1);
        String vb = Double.toString(v2);

        //参数判断-非空
        boolean requiredNotBlank = requiredNotBlank(va,vb);
        if (!requiredNotBlank){
            System.out.println("参数异常, 两个数不可以为空, 不可以为null");
            return null;
        }

        //参数判断-非数值
        if (!(requiredStrictNumber(va)) || !(requiredStrictNumber(vb))){
            System.out.println("参数不是数值");
            return null;
        }

        //参数判断：是否超长
        if (!(requiredLengthLimit(va,vb))){
            System.out.println("参数异常, 参数长度超过了最大限制");
            return null;
        }

        //参数判断: 校验数值是否合法
        if (!(requiredCommonsNumeric(va)) || !(requiredCommonsNumeric(vb))){
            System.out.println("参数不合法");
            return null;
        }

        //初始化BigDecimal对象时, 传参最好用string(可以看代码, 也可以看网上资料)
        BigDecimal b1 = new BigDecimal(va);
        BigDecimal b2 = new BigDecimal(vb);
        return b1.add(b2).toString();

    }




}






