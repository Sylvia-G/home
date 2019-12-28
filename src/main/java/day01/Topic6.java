package day01;

/**
 * 基于startWith,实现可忽略大小写的实现，即，abc_和ABC_ 皆 可 以
 */

public class Topic6 {
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
    //小写字母-abc开头: "abc23Kf"
    private static void test3(){
        String value = "abc23Kf";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //小写字母-abc开头-前后有空格(兼容): " abc23Kf "
    private static void test4(){
        String value = " abc23Kf ";
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
    //大写字母-ABC开头: "ABCsdf230"
    private static void test7(){
        String value = "ABCsdf230";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }
    //大写字母-ABC开头-前后有空格(兼容): " ABCf23 "
    private static void test8(){
        String value = " ABCf23 ";
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
    //非ABC/abc开头测试: abDcdfABk
    private static void test15(){
        String value = "abDcdfABk";
        System.out.println(value + "可忽略大小写: " + startWith(value));
    }

    //3层if嵌套看起来好..., 学完看下能怎么优化
    public static boolean startWith(String value){
        String str = value.trim();
        if(str.charAt(0) == 'a' || str.charAt(0) == 'A'){
            if (str.charAt(1) == 'b' || str.charAt(1) == 'B'){
                if (str.charAt(2) == 'c' || str.charAt(2) == 'C'){
                    return true;
                }else {return false;}
        }else {return false;}
        }else {return false;}
    }
}
