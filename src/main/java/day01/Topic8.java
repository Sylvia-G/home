package day01;

import org.junit.Test;

/**
 *8■实现toTitle()转化，即："hello"输出"Hello"
 * @Author: Sylvia-G
 * */
public class Topic8 {

    @Test
    public void tset() {
        //前后有空格, 首字母小写: " hello world! "
        String test1 = new String(" hello world! ");
        System.out.println("转化前: " + test1 + "\n转换后: " + toTitle(test1));

        //首字母大写: "HELLO WORLD! "
        String test2 = new String("HELLO WORLD! ");
        System.out.println("转化前: " + test2 + "\n转换后: " + toTitle(test2));

        //首字符非字母: "*23hello world!"
        String test3 = new String("*23hello world!");
        System.out.println("转化前: " + test3 + "\n转换后: " + toTitle(test3));
    }

    /**
     * 这里title的标准, 是一句话中的首个单词的首字母大写
     * @param value
     * @return
     */
    private static String toTitle(String value){
        char adorer ='a';
        char zanier ='z';

        StringBuffer temp = new StringBuffer(value.trim());
        char ch = value.charAt(0);
        if (ch >= adorer && ch <= zanier) {
            //为什么走ch -= 32; value.setCharAt(0,ch);逻辑, value.charAt(0)仍然是小写字母?
            ch = (char) (ch - 32);
            temp.setCharAt(0, ch);
            return String.valueOf(temp);
        } else {
            return String.valueOf(temp);
        }
    }
}
