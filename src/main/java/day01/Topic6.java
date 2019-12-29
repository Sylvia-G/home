package day01;

import org.junit.Test;

/**
 * 基于startWith,实现可忽略大小写的实现，即，abc_和ABC_ 皆 可 以
 * @Author: Sylvia-G
 */

public class Topic6 {

    @Test
    public void test() {
        //小写字母-有且仅有abc: "abc"
        String test1 = "abc";
        System.out.println(test1 + "可忽略大小写: " + startWith(test1));

        //小写字母-有且仅有abc-前后有空格(兼容): " abc "
        String test2 = " abc ";
        System.out.println(test2 + "可忽略大小写: " + startWith(test2));

        //小写字母-abc开头: "abc23Kf"
        String test3 = "abc23Kf";
        System.out.println(test3 + "可忽略大小写: " + startWith(test3));

        //小写字母-abc开头-前后有空格(兼容): " abc23Kf "
        String test4 = " abc23Kf ";
        System.out.println(test4 + "可忽略大小写: " + startWith(test4));

        //大写字母-有且仅有ABC: "ABC"
        String test5 = "ABC";
        System.out.println(test5 + "可忽略大小写: " + startWith(test5));

        //大写字母-有且仅有ABC-前后有空格(兼容): " ABC "
        String test6 = " ABC ";
        System.out.println(test6 + "可忽略大小写: " + startWith(test6));

        //大写字母-ABC开头: "ABCsdf230"
        String test7 = "ABCsdf230";
        System.out.println(test7 + "可忽略大小写: " + startWith(test7));

        //大写字母-ABC开头-前后有空格(兼容): " ABCf23 "
        String test8 = " ABCf23 ";
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

        //非ABC/abc开头测试: abDcdfABk
        String test15 = "abDcdfABk";
        System.out.println(test15 + "可忽略大小写: " + startWith(test15));
    }





    /**
     *
     * @param value
     * @return
     * 3层if嵌套看起来好..., 学完看下能怎么优化
     */
    private static boolean startWith(String value){
        char aLower ='a';
        char bLower ='b';
        char cLower ='c';
        char aUpper ='A';
        char bUpper ='B';
        char cUpper ='C';
        String str = value.trim();

        if(str.charAt(0) == aLower || str.charAt(0) == aUpper){
            if (str.charAt(1) == bLower || str.charAt(1) == bUpper){
                if (str.charAt(2) == cLower || str.charAt(2) == cUpper){
                    return true;
                }else {return false;}
        }else {return false;}
        }else {return false;}
    }
}
