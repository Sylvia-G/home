package day01;

import org.junit.Test;

/**
 * 实现字符串左空格trim, 例 .字 符 串 " a b c  " , 输 出 "abc "
 * @Author: Sylvia-G
 */
public class Topic3 {
    @Test
    public void test(){
        //无空格: 不需要左trim():"abc"
        String test1 = "abc";
        System.out.println("转换前:" + test1 + "\n" + "转换后:" +  leftTrim(test1));

        //一个空格: 仅最左要左trim(): " abc"
        String test2 = " abc";
        System.out.println("转换前:" + test2 + "\n" + "转换后:" +  leftTrim(test2));

        //一个空格: 仅中间要左trim(): "a bc"
        String test3 = "a bc";
        System.out.println("转换前:" + test3 + "\n" + "转换后:" +  leftTrim(test3));

        //多个空格: 最左开始连续左trim: " a b c "
        String test4 = " a b c ";
        System.out.println("转换前:" + test4 + "\n" + "转换后:" +  leftTrim(test4));

        //多个空格: 最左开始间隔左trim: " ab cd "
        String test5 = " ab cd ";
        System.out.println("转换前:" + test5 + "\n" + "转换后:" +  leftTrim(test5));

        //非空串的空格字符: \n换行符, \t制表符,\r回车符
        String test6 = "\n" +
                "ab\n" +
                "cd ";
        System.out.println("转换前:" + test6 + "\n" + "转换后:" +  leftTrim(test6));

        //非空串的空格字符: \t制表符
        String test7 = "\t" +
                "ab\t" +
                "cd ";
        System.out.println("转换前:" + test7 + "\n" + "转换后:" +  leftTrim(test7));

    }

    private static String leftTrim(String value){
        int len = value.length();
        StringBuffer result = new StringBuffer();
        char char1 = ' ';
        char char2 = '\n';
        char char3 = '\t';

        for (int i=0; i<=len-1; i++){
            boolean judge1 = (char1 != value.charAt(i));
            boolean judge2 = (char2 != value.charAt(i));
            boolean judge3 = (char3 != value.charAt(i));
            boolean judge4 = (i !=(len-1));
            if ( judge1 && judge2 && judge3 && judge4){
                result.append(value.charAt(i));
            }
            else if ((i==(len-1))){
                result.append(value.charAt(i));
            }
        }
        return String.valueOf(result);

    }
}

