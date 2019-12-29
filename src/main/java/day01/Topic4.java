package day01;

import org.junit.Test;

/**
 * 实现字符串右空格trim, 例 .字 符 串 " a b c  " , 输 出 "  abc"
 * 实现反了!!
 * @Author: Sylvia-G
 */

public class Topic4 {
    @Test
    public void test() {
        //无空格: 不需要右trim():"abc"
        String test1 = "abc";
        System.out.println("转换前:" + test1 + "\n" + "转换后:" +  rightTrim(test1));

        //一个空格: 不需要右trim(): " abc"
        String test2 = " abc";
        System.out.println("转换前:" + test2 + "\n" + "转换后:" +  rightTrim(test2));

        //一个空格: 仅中间要右trim(): "a bc"
        String test3 = "a bc";
        System.out.println("转换前:" + test3 + "\n" + "转换后:" +  rightTrim(test3));

        //多个空格: 最右开始连续右trim: " a b c "
        String test4 = " a b c ";
        System.out.println("转换前:" + test4 + "\n" + "转换后:" +  rightTrim(test4));

        //多个空格: 最右开始间隔右trim: " ab cd "
        String test5 = " ab cd ";
        System.out.println("转换前:" + test5 + "\n" + "转换后:" +  rightTrim(test5));

        //非空串的空格字符: \n换行符, \t制表符,\r回车符
        String test6 = "\n" +
                    "ab\n" +
                    "cd ";
        System.out.println("转换前:" + test6 + "\n" + "转换后:" +  rightTrim(test6));

        //非空串的空格字符: \t制表符
        String test7 = "\t" +
                    "ab\t" +
                    "cd ";
        System.out.println("转换前:" + test7 + "\n" + "转换后:" +  rightTrim(test7));
    }


    private static String rightTrim(String value){
        int len = value.length();
        StringBuffer result = new StringBuffer();

        for (int i=len-1; i>=0; i--){
            boolean judge1 = (' ' != value.charAt(i));
            boolean judge2 = ('\n' != value.charAt(i));
            boolean judge3 = ('\t' != value.charAt(i));
            boolean judge4 = (i != 0);
            if (judge1 && judge2 && judge3 && judge4){
                result.append(value.charAt(i));
            }
            else if ((i==0)){
                result.append(value.charAt(i));
            }
        }
        return String.valueOf(result.reverse());

    }





}
