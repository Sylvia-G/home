package day00;//编程:星期转换
//输入1, 输出星期一
//输入一, 输出星期1
//要求: 考虑健壮性

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("please enter a string:");
        Scanner sc = new Scanner(System.in);
        String istring = sc.next();
        if (istring.equals("1")){
            System.out.println("星期一");
        }else if (istring.equals("一")){
            System.out.println("星期1");
        }else {
            System.out.println("besttest");
        }

    }


}
