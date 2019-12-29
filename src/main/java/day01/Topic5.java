package day01;

import org.junit.Test;

/**
 * @Author: Sylvia-G
 */

public class Topic5 {

    @Test
    public void test() {
        char key = '*';

        //不含指定字符: "abc"
        String test1 = "abc";
        System.out.println("转换前:" + test1 + "\n" + "转换后:" +  leftAndRightTrim(test1,key));

        //只含1个指定字符,最左trim(): "*abc"
        String test2 = "*abc";
        System.out.println("转换前:" + test2 + "\n" + "转换后:" +  leftAndRightTrim(test2,key));

        //只含1个指定字符, 中间trim():"a*bc"
        String test3 = "ab*c";
        System.out.println("转换前:" + test3 + "\n" + "转换后:" +  leftAndRightTrim(test3,key));

        //只含1个指定字符, 右边trim():"abc*"
        String test4 = "abc*";
        System.out.println("转换前:" + test4 + "\n" + "转换后:" +  leftAndRightTrim(test4,key));

        //含多个指定字符, 左边trim():"***abcd"
        String test5 = "***abcd";
        System.out.println("转换前:" + test5 + "\n" + "转换后:" +  leftAndRightTrim(test5,key));

        //含多个指定字符, 左边+中间间隔trim():"**a*bc***d"
        String test6 = "**a*bc***d";
        System.out.println("转换前:" + test6 + "\n" + "转换后:" +  leftAndRightTrim(test6,key));

        //含多个指定字符, 右边trim():"abcd***********"
        String test7 = "abcd***********";
        System.out.println("转换前:" + test7 + "\n" + "转换后:" +  leftAndRightTrim(test7,key));

        //含多个指定字符, 左中间隔右trim():"*a********b*c*d***********"
        String test8 = "*a********b*c*d***********";
        System.out.println("转换前:" + test8 + "\n" + "转换后:" +  leftAndRightTrim(test8,key));

    }


    private static String leftAndRightTrim(String value, char key){
        StringBuffer result = new StringBuffer();
        for (int i=0; i<value.length(); i++){
            if (value.charAt(i) != key){
                result.append(value.charAt(i));
            }
        }
        return String.valueOf(result);

    }

}
