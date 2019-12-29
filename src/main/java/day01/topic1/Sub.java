package day01.topic1;

import java.math.BigDecimal;

import static day01.topic1.ParamJudge.*;
import static day01.topic1.ParamJudge.requiredCommonsNumeric;

/**
 * @Author: Sylvia-G
 * @Date: 2019/12/29 15:06
 */
public class Sub {
    public static void main(String[] args) {

    }

    /**
     *提供减法运算
     * @param v1 被减数
     * @param v2 减数
     * 健壮性考虑: 参数判断(非空/非数值/超长/不同类型[String/Double])、参数计算(整型/浮点型/大数)
     */
    public static String sub(String v1, String v2){
        //参数判断: 非空
        boolean requiredNotBlank = requiredNotBlank(v1,v2);
        if (!requiredNotBlank){
            System.out.println("参数异常, 两个数不可以为空, 不可以为null");
            return null;
        }

        //参数判断：是否数值
        if (!(requiredStrictNumber(v1)) || !(requiredStrictNumber(v2))){
            System.out.println("参数不是数值");
            return null;
        }

        //参数判断：长度是否超长
        if (!(requiredLengthLimit(v1,v2))){
            System.out.println("参数异常, 参数长度超过了最大限制");
            return null;
        }

        //参数判断: 校验数值是否合法
        if (!(requiredCommonsNumeric(v1)) || !(requiredCommonsNumeric(v2))){
            System.out.println("参数不合法");
            return null;
        }

        BigDecimal s1 = new BigDecimal(v1);
        BigDecimal s2 = new BigDecimal(v2);
        return s1.subtract(s2).toString();

    }

}
