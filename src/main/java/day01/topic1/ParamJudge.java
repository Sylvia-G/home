package day01.topic1;

/**
 * @Author: Sylvia-G
 * @Date: 2019/12/29 14:54
 */
public class ParamJudge {

    /**
     * 要求参数不为空
     */
    public static boolean requiredNotBlank(String v1, String v2){
        return notEmptyJudge(v1, v2);
    }

    private static boolean notEmptyJudge(String v1, String v2) {
        if (null == v1 || null == v2){
            return false;
        }
        if (v1.trim().isEmpty() || v2.trim().isEmpty()){
            return false;
        }
        return true;
    }

    /**
     * 要求参数长度不超过限制
     */
    public static boolean requiredLengthLimit(String v1, String v2){
        return v1.length()<=8 && v2.length()<=8;
    }

    /**
     * 要求参数是数值:整数或者小数
     */
    public static boolean requiredStrictNumber(String v1){
        return strictNumberJudge(v1);
    }

    private static boolean strictNumberJudge(String v1) {
        int sum = 0;
        char separator= '.';
        char[] chars = v1.toCharArray();
        if (chars[0] == separator || chars[chars.length-1]==separator){
            return false;
        }

        for (int i=0; i<chars.length; i++){
            if (chars[i]=='.'){
                sum++;
            }

            if (chars[i]=='-' && i!=0){
                return false;
            }
        }

        return sum<=1;
    }

    /**
     * 判断参数字符只能是0~9之间, 以及小数点'.', 符号'-'
     * @param v1
     * @return
     */
    public static boolean requiredCommonsNumeric(String v1){
        char start = '0';
        char end = '9';
        char decimalPoint= '.';
        char minusSign= '-';

        //不需要校验非空, 入参已校验
        char[] chars = v1.toCharArray();
        for (char ch: chars){
            //数值表示, 一般在0~9之间, 以及小数点
            boolean A = (start<=ch && ch<=end);
            boolean B = (ch==decimalPoint);
            boolean C = (ch==minusSign);
            if ( A || B || C ) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

}
