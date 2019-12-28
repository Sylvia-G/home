package day01;

public class Topic5 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();

    }

    //不含指定字符: "abc"
    private static void test1(){
        String value = "abc";
        char key = '*';
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftAndRightTrim(value,key));
    }
    //只含1个指定字符,最左trim(): "*abc"
    private static void test2(){
        String value = "*abc";
        char key = '*';
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftAndRightTrim(value,key));
    }
    //只含1个指定字符, 中间trim():"a*bc"
    private static void test3(){
        String value = "ab*c";
        char key = '*';
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftAndRightTrim(value,key));
    }
    //只含1个指定字符, 右边trim():"abc*"
    private static void test4(){
        String value = "abc*";
        char key = '*';
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftAndRightTrim(value,key));
    }
    //含多个指定字符, 左边trim():"***abcd"
    private static void test5(){
        String value = "***abcd";
        char key = '*';
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftAndRightTrim(value,key));
    }
    //含多个指定字符, 左边+中间间隔trim():"**a*bc***d"
    private static void test6(){
        String value = "**a*bc***d";
        char key = '*';
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftAndRightTrim(value,key));
    }
    //含多个指定字符, 右边trim():"abcd***********"
    private static void test7(){
        String value = "abcd***********";
        char key = '*';
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftAndRightTrim(value,key));
    }
    //含多个指定字符, 左中间隔右trim():"*a********b*c*d***********"
    private static void test8(){
        String value = "*a********b*c*d***********";
        char key = '*';
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftAndRightTrim(value,key));
    }


    public static String leftAndRightTrim(String value, char key){
        String result = "";
        for (int i=0; i<value.length(); i++){
            if (value.charAt(i) != key){
                result+=value.charAt(i);
            }
        }
        return result;

    }

}
