package day01;

/**
 * 基于endWith,实现可忽略大小写的实现，即，_abc和_ABC 皆可以
 */

public class Topic7 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
        test11();
        test12();
        test13();
        test14();
        test15();
    }

    //小写字母-有且仅有abc: "abc"
    private static void test1(){
        String value = "abc";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //小写字母-有且仅有abc-前后有空格(兼容): " abc "
    private static void test2(){
        String value = " abc ";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //小写字母-abc结尾: "23Kfabc"
    private static void test3(){
        String value = "23Kfabc";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //小写字母-abc结尾-前后有空格(兼容): " 23Kfabc "
    private static void test4(){
        String value = " 23Kfabc ";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大写字母-有且仅有ABC: "ABC"
    private static void test5(){
        String value = "ABC";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大写字母-有且仅有ABC-前后有空格(兼容): " ABC "
    private static void test6(){
        String value = " ABC ";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大写字母-ABC结尾: "sdf230ABC"
    private static void test7(){
        String value = "sdf230ABC";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大写字母-ABC结尾-前后有空格(兼容): " f23ABC "
    private static void test8(){
        String value = " f23ABC ";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大小写混合:"Abc"
    private static void test9(){
        String value = "Abc";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大小写混合:"aBc"
    private static void test10(){
        String value = "aBc";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大小写混合:"abC"
    private static void test11(){
        String value = "abC";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大小写混合:"aBC"
    private static void test12(){
        String value = "aBC";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大小写混合:"AbC"
    private static void test13(){
        String value = "AbC";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大小写混合:"ABc"
    private static void test14(){
        String value = "ABc";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }

    //非ABC/abc结尾测试: sdfABk
    private static void test15(){
        String value = "sdfABk";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }

    //3层if嵌套看起来好..., 学完看下能怎么优化
    public static boolean startWith(String value){
        String str = value.trim();
        int len = str.length();
        if(str.charAt(len-3) == 'a' || str.charAt(len-3) == 'A'){
            if (str.charAt(len-2) == 'b' || str.charAt(len-2) == 'B'){
                if (str.charAt(len-1) == 'c' || str.charAt(len-1) == 'C'){
                    return true;
                }else {return false;}
            }else {return false;}
        }else {return false;}
    }
}
