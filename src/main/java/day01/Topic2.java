package day01; /**1
 .使用BigDecimal写一个计算器, 实现加减乘除, 考虑可能是很大的数值计算场景
 * */

import java.math.BigDecimal;

public class Topic2 {
    //测试入口
    public static void main(String[] args) {

        /**
         * add()测试
         * */
        test1();
        test2();

    }
    //String测试
    public static void test1(){
        String res = add("123","456");
        System.out.println(res);

    }

    //double测试
    public static  void test2(){
        String res = add(123.0,456.00);
        System.out.println(res);
    }



    /**
     *提供加法运算
     * @param v1 被加数
     * @param v2 加数
     */
    public static String add(String v1, String v2){
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
        if (!(requiredCommonsNumeric(v1))){
            System.out.println("参数" + v1 +"不合法");
            return null;
        }
        if (!(requiredCommonsNumeric(v2))){
            System.out.println("参数"+ v2 +"不合法");
            return null;
        }

        //判断参数是不是数值
        if (!(requiredStricNumber(v1))){
            System.out.println("参数"+ v1 + "不是数值");
            return null;
        }
        if (!(requiredStricNumber(v2))){
            System.out.println("参数"+ v2 + "不是数值");
            return null;
        }

        //初始化BigDecimal对象时, 传参最好用string(可以看代码, 也可以看网上资料)
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.add(b2).toString();

    }

    //兼容double类型
    public static String add(double v1, double v2){
        //double转String
        String va = Double.toString(v1);
        String vb = Double.toString(v2);

        //判断参数是否为空
        boolean requiredNotBlank = requiredNotBlank(va,vb);
        if (!requiredNotBlank){
            System.out.println("参数异常, 两个数不可以为空, 不可以为null");
            return null;
        }

        //判断参数长度是否符合
        if (!(requiredLengthLimit(va,vb))){
            System.out.println("参数异常, 参数长度超过了最大限制");
            return null;
        }

        //校验数值是不是合法
        if (!(requiredCommonsNumeric(va))){
            System.out.println("参数" + v1 +"不合法");
            return null;
        }
        if (!(requiredCommonsNumeric(vb))){
            System.out.println("参数"+ v2 +"不合法");
            return null;
        }

        //判断参数是不是数值
        if (!(requiredStricNumber(va))){
            System.out.println("参数"+ v1 + "不是数值");
            return null;
        }
        if (!(requiredStricNumber(vb))){
            System.out.println("参数"+ v2 + "不是数值");
            return null;
        }

        //初始化BigDecimal对象时, 传参最好用string(可以看代码, 也可以看网上资料)
        BigDecimal b1 = new BigDecimal(va);
        BigDecimal b2 = new BigDecimal(vb);
        return b1.add(b2).toString();

    }

    //要求参数不为空
    private static boolean requiredNotBlank(String v1, String v2){
        if (null == v1 || null == v2){
            return false;
        }
        if (v1.trim().isEmpty() || v2.trim().isEmpty()){
            return false;
        }

        return true;
    }

    //要求参数长度不超过限制
    private static  boolean requiredLengthLimit(String v1, String v2){
        return v1.length()<=8 && v2.length()<=8;
    }

    //要求参数是数值:整数或者小数
    private static boolean requiredStricNumber(String v1){
        int sum = 0;
        char[] chars = v1.toCharArray();
        if (chars[0] == '.' || chars[chars.length-1]=='.'){
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

    //判断参数字符只能是0~9之间, 以及小数点'.', 符号'-'
    private static boolean requiredCommonsNumeric(String v1){
        //不需要校验非空, 入参已校验
        char[] chars = v1.toCharArray();
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






