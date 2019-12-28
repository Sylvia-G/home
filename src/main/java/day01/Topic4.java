package day01;

/**
 * 实现字符串右空格trim, 例 .字 符 串 " a b c  " , 输 出 "  abc"
 * 实现反了!!
 */

public class Topic4 {
    public static void main(String[] args) {
        test7();
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();

    }

    //无空格: 不需要右trim():"abc"
    public static void test7(){
        String value = "abc";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  rightTrim(value));
    }

    //一个空格: 不需要右trim(): " abc"
    public static void test1(){
        String value = " abc";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  rightTrim(value));
    }
    //一个空格: 仅中间要右trim(): "a bc"
    public static void test2(){
        String value = "a bc";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  rightTrim(value));
    }
    //多个空格: 最右开始连续右trim: " a b c "
    public static void test3(){
        String value = " a b c ";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  rightTrim(value));
    }
    //多个空格: 最右开始间隔右trim: " ab cd "
    public static void test4(){
        String value = " ab cd ";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  rightTrim(value));
    }
    //非空串的空格字符: \n换行符, \t制表符,\r回车符
    public static void test5(){
        String value = "\n" +
                "ab\n" +
                "cd ";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  rightTrim(value));
    }

    //非空串的空格字符: \t制表符
    public static void test6(){
        String value = "\t" +
                "ab\t" +
                "cd ";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  rightTrim(value));
    }

    private static String rightTrim(String value){
        int len = value.length();
        String result = "";
        char char1 = ' ';
        char char2 = '\n';
        char char3 = '\t';

        for (int i=len-1; i>=0; i--){
            if ((char1 != value.charAt(i)) && (char2 != value.charAt(i)) && (char3 != value.charAt(i)) && (i != 0)){
                result+=value.charAt(i);
            }
            else if ((i==0)){
                result+=value.charAt(i);
            }else {
            }
        }
        return new StringBuffer(result).reverse().toString();

    }





}
