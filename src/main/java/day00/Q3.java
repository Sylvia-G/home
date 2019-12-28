package day00;//编程: 字符串大写并反转
//原生编程方式实现给定字符串的大写并反转
//如: "abc"反转为"CBA"
//要求:考虑健壮性

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();

        StringBuffer afterUpperCase = toUpperCase(in);
        System.out.println("toUpperCase: "+afterUpperCase);

        StringBuffer afterreverse = reverse(afterUpperCase);
        System.out.println("reverse: "+afterreverse);

    }

    public  static StringBuffer toUpperCase(String instring){
        StringBuffer outstring = new StringBuffer("");
        for(int i=0; i<instring.length();i++){
            char ch = instring.charAt(i);
            if(ch>='a' && ch<='z'){
                ch -= 32;
                outstring.append(ch);
            }else {
                outstring.append(ch);
            }

        }
        return outstring;

        /**
         * 原理：
         *     字符char采用的是Unicode编码的16位字符类型，其表示范围是0-65536。标准的8位ASCII字符集是Unicode
         *     的子集，其取值范围为0-127。大小写字母之间正好相差32
         */
    }

    public static StringBuffer reverse(StringBuffer instring){
        StringBuffer outstring = new StringBuffer("");
        for(int i=instring.length()-1; i>=0; i--){
            char ch = instring.charAt(i);
            outstring.append(ch);
        }
        return outstring;
    }
}


//AAA
//aaa
//AaA
//1AaA
//Character.toUpperCase(char)
//Character.toString(char)

//轮询每一个字符串的字符, 如果是a-z,转换成大写,存list; 如果不是a-z,不做任何转换直接存list