package day01;

/**
 *8■实现toTitle()转化，即："hello"输出"Hello"
 * 感觉这个题写的不好, 为了处理title空格做了2次类型转换：StringBuffer->String->StringBuffer, 累赘
 * */
public class Topic8 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    //前后有空格, 首字母小写: " hello world! "
    public static void test1() {
        StringBuffer value = new StringBuffer(" hello world! ");
        System.out.println("转化前: " + value + "\n转换后: " + delTrim(value));
    }

    //首字母大写: "HELLO WORLD! "
    public static void test2() {
        StringBuffer value = new StringBuffer("HELLO WORLD! ");
        System.out.println("转化前: " + value + "\n转换后: " + delTrim(value));
    }

    //首字符非字母: "*23hello world!"
    public static void test3() {
        StringBuffer value = new StringBuffer("*23hello world!");
        System.out.println("转化前: " + value + "\n转换后: " + delTrim(value));
    }



    private static StringBuffer delTrim(StringBuffer value) {
        if (value.charAt(0) == ' ') {
            String dtValue = value.toString().trim();
            StringBuffer trimValue = new StringBuffer(dtValue);
            return toTitle(trimValue);
        } else {
            return toTitle(value);
        }
    }

    //这里title的标准, 是一句话中的首个单词的首字母大写,
    private static StringBuffer toTitle(StringBuffer value){
        char ch = value.charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            //为什么走ch -= 32; value.setCharAt(0,ch);逻辑, value.charAt(0)仍然是小写字母?
            ch = (char) (ch - 32);
            value.setCharAt(0, ch);
            return value;
        } else {
            return value;
        }
    }
}
