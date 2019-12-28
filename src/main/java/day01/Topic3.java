package day01;

/**
 * 实现字符串左空格trim, 例 .字 符 串 " a b c  " , 输 出 "abc "
 */
public class Topic3 {
    public static void main(String[] args) {
        test7();
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
//        test6();

    }

    //无空格: 不需要左trim():"abc"
    public static void test7(){
        String value = "abc";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftTrim(value));
    }

    //一个空格: 仅最左要左trim(): " abc"
    public static void test1(){
        String value = " abc";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftTrim(value));
    }
    //一个空格: 仅中间要左trim(): "a bc"
    public static void test2(){
        String value = "a bc";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftTrim(value));
    }
    //多个空格: 最左开始连续左trim: " a b c "
    public static void test3(){
        String value = " a b c ";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftTrim(value));
    }
    //多个空格: 最左开始间隔左trim: " ab cd "
    public static void test4(){
        String value = " ab cd ";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftTrim(value));
    }
    //非空串的空格字符: \n换行符, \t制表符,\r回车符
    public static void test5(){
        String value = "\n" +
                "ab\n" +
                "cd ";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftTrim(value));
    }

    //非空串的空格字符: \t制表符
    public static void test6(){
        String value = "\t" +
                "ab\t" +
                "cd ";
        System.out.println("转换前:" + value + "\n" + "转换后:" +  leftTrim(value));
    }

    private static String leftTrim(String value){
        int len = value.length();
        String result = "";
        char char1 = ' ';
        char char2 = '\n';
        char char3 = '\t';

        for (int i=0; i<=len-1; i++){
            if ((char1 != value.charAt(i)) && (char2 != value.charAt(i)) && (char3 != value.charAt(i)) && (i !=(len-1))){
                result+=value.charAt(i);
            }
            else if ((i==(len-1))){
                result+=value.charAt(i);
            }else {
            }
        }
        return result;

    }





}

