package day01;

import org.junit.Test;

/**
 * 基于endWith,实现可忽略大小写的实现，即，_abc和_ABC 皆可以
 * @Author: Sylvia-G
 */

public class Topic7 {

    @Test
    public void test() {
        //小写字母-有且仅有abc: "abc"
        String test1 = "abc";
        System.out.println(test1 + "可忽略大小写: " + startWith(test1));

        //小写字母-有且仅有abc-前后有空格(兼容): " abc "
        String test2 = " abc ";
        System.out.println(test2 + "可忽略大小写: " + startWith(test2));

        //小写字母-abc结尾: "23Kfabc"
        String test3 = "23Kfabc";
        System.out.println(test3 + "可忽略大小写: " + startWith(test3));

        //小写字母-abc结尾-前后有空格(兼容): " 23Kfabc "
        String test4 = " 23Kfabc ";
        System.out.println(test4 + "可忽略大小写: " + startWith(test4));

        //大写字母-有且仅有ABC: "ABC"
        String test5 = "ABC";
        System.out.println(test5 + "可忽略大小写: " + startWith(test5));

        //大写字母-有且仅有ABC-前后有空格(兼容): " ABC "
        String test6 = " ABC ";
        System.out.println(test6 + "可忽略大小写: " + startWith(test6));

        //大写字母-ABC结尾: "sdf230ABC"
        String test7 = "sdf230ABC";
        System.out.println(test7 + "可忽略大小写: " + startWith(test7));

        //大写字母-ABC结尾-前后有空格(兼容): " f23ABC "
        String test8 = " f23ABC ";
        System.out.println(test8 + "可忽略大小写: " + startWith(test8));

        //大小写混合:"Abc"
        String test9 = "Abc";
        System.out.println(test9 + "可忽略大小写: " + startWith(test9));

        //大小写混合:"aBc"
        String test10 = "aBc";
        System.out.println(test10 + "可忽略大小写: " + startWith(test10));

        //大小写混合:"abC"
        String test11 = "abC";
        System.out.println(test11 + "可忽略大小写: " + startWith(test11));

        //大小写混合:"aBC"
        String test12 = "aBC";
        System.out.println(test12 + "可忽略大小写: " + startWith(test12));

        //大小写混合:"AbC"
        String test13 = "AbC";
        System.out.println(test13 + "可忽略大小写: " + startWith(test13));

        //大小写混合:"ABc"
        String test14 = "ABc";
        System.out.println(test14 + "可忽略大小写: " + startWith(test14));

        //非ABC/abc结尾测试: sdfABk
        String test15 = "sdfABk";
        System.out.println(test15 + "可忽略大小写: " + startWith(test15));
    }


    /**
     * 3层if嵌套看起来好..., 学完看下能怎么优化
     * @param value
     * @return
     */
    public static boolean startWith(String value){
        String str = value.trim();
        char aLower ='a';
        char bLower ='b';
        char cLower ='c';
        char aUpper ='A';
        char bUpper ='B';
        char cUpper ='C';

        int len = str.length();
        if(str.charAt(len-3) == aLower || str.charAt(len-3) == aUpper){
            if (str.charAt(len-2) == bLower || str.charAt(len-2) == bUpper){
                if (str.charAt(len-1) == cLower || str.charAt(len-1) == cUpper){
                    return true;
                }else {return false;}
            }else {return false;}
        }else {return false;}
    }
}
