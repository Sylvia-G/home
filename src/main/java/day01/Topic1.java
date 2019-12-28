package day01; /**1
 .使用BigDecimal写一个计算器, 实现加减乘除, 考虑可能是很大的数值计算场景
 * */

import java.math.BigDecimal;

public class Topic1 {
    //测试入口
    public static void main(String[] args) {

        /**
         * add()测试
         * */
        test3();
        test1();
        test2();
        testBigNumber1();
        testBigNumber2();
        testBigNumber3();
        testBlankNumber1();
        testBlankNumber2();
        testBlankNumber3();
        testBlankNumber4();
        testFloatNumber1();
        testFloatNumber2();
        testFloatNumber3();
        testZero1();
        testNotNumber1();
        testNotNumber2();
        testInvalidNumber1();
        testInvalidNumber2();
        testStrictInvalidParams1();
        testStrictInvalidParams2();
        testStrictInvalidParams3();
        testStrictInvalidParams3();
        testStrictInvalidParams4();
        testStrictInvalidParams5();
        testStrictInvalidParams6();
    }

    public  static void test3(){
        String res = add("987.00","0.456");
        System.out.println(res);
    }

    //追加测试
    public static void test1(){
        String res = add("123","-123");
        System.out.println(res);

    }

    //追加测试
    public static  void test2(){
        String res = add("123","1-23");
        System.out.println(res);
    }

    //case03, 边界测试, 长度9
    public static void testBigNumber1(){
        String res = add(
                "111111111",
                "111111111");
        System.out.println(res);
    }

    //case4, 边界测试, 长度8
    public static void testBigNumber2() {
        String res = add(
                "11111111",
                "11111111");
        System.out.println(res);

    }

    //case5 边界测试, 长度7
    public static void testBigNumber3() {
        String res = add(
                "1111111",
                "1111111");
        System.out.println(res);

    }

    //case6, 浮点数, 超长测试
    public static void testFloatNumber1() {
        String res = add(
                "1.00000000000000000000000000000000000000000000000000000",
                "1.00000000000000000000000000000000000000000000000000000");
        System.out.println(res);

    }

    //case7, 浮点数大数测试, 大于0
    public static void testFloatNumber2() {
        String res = add(
                "0.100000000000000000000000000000000000000000000000000000",
                "0.100000000000000000000000000000000000000000000000000000");
        System.out.println(res);

    }

    //case8, 浮点数大数, 小于0
    public static void testFloatNumber3() {
        String res = add(
                "0.00000000000000000000000000000000000000000000000000001",
                "0.00000000000000000000000000000000000000000000000000001");
        System.out.println(res);

    }

    //case9, 0相加
    public static void testZero1() {
        String res = add(
                "0",
                "0");
        System.out.println(res);

    }

    //case10, 第一个参数非数字
    public static void testNotNumber1() {
        String res = add(
                "a",
                "123");
        System.out.println(res);

    }

    //case11, 第二个参数非数字
    public static void testNotNumber2() {
        String res = add(
                "213",
                "b");
        System.out.println(res);

    }

    //case12, 第一个参数为空串
    public static void testBlankNumber1() {
        String res = add(
                "",
                "123");
        System.out.println(res);

    }

    //case13, 第二个参数为空串
    public static void testBlankNumber2() {
        String res = add(
                "34534",
                "");
        System.out.println(res);

    }

    //case14, 第一个参数为null
    public static void testBlankNumber3() {
        String res = add(
                null,
                "123");
        System.out.println(res);

    }

    //case15, 第二个参数为null
    public static void testBlankNumber4() {
        String res = add(
                "234354",
                null);
        System.out.println(res);

    }

    //case16, 第一个参数异常
    public static void testInvalidNumber1() {
        String res = add(
                "23  78",
                "123");
        System.out.println(res);

    }

    //case17, 第二个参数异常
    public static void testInvalidNumber2() {
        String res = add(
                "2378",
                "1--23");
        System.out.println(res);

    }

    //case18, 异常数值
    public static void testStrictInvalidParams1() {
        String res = add(
                ".789",
                "123");
        System.out.println(res);

    }

    //case19, 异常数值
    public static void testStrictInvalidParams2() {
        String res = add(
                "7.8.9",
                "123");
        System.out.println(res);

    }

    //case20, 异常数值
    public static void testStrictInvalidParams3() {
        String res = add(
                "789.",
                "123");
        System.out.println(res);

    }

    //case21, 异常数值
    public static void testStrictInvalidParams4() {
        String res = add(
                "789",
                ".123");
        System.out.println(res);

    }
    //case22, 异常数值
    public static void testStrictInvalidParams5() {
        String res = add(
                "789",
                "1.2.3");
        System.out.println(res);

    }

    //case23, 异常数值
    public static void testStrictInvalidParams6() {
        String res = add(
                "789",
                "123.");
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


    /**
     *提供减法运算
     * @param v1 被减数
     * @param v2 减数
     */
    public static String sub(String v1, String v2){
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

        BigDecimal s1 = new BigDecimal(v1);
        BigDecimal s2 = new BigDecimal(v2);
        return s1.subtract(s2).toString();

    }

    /**
     * 提供乘法运算
     * @param v1 被乘数
     * @param v2 乘数
     */

    public static String mul(String v1, String v2){
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

        BigDecimal s1 = new BigDecimal(v1);
        BigDecimal s2 = new BigDecimal(v2);
        return s1.multiply(s2).toString();

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

        if (scale<0){
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal s1 = new BigDecimal(v1);
        BigDecimal s2 = new BigDecimal(v2);
        return s1.divide(s2, scale, BigDecimal.ROUND_HALF_UP).toString();

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






