package day00;

import java.util.Scanner;
import java.util.regex.Pattern;

//编程: 输入处理
//控制台输入信息(Scanner input = new Scanner(System.in))
//若输入的内容是数字n=1-9, 则对应输入hello+n
//    -例子: 输入1则打印hello1, 输入9则打印hello9
//若输入的是字符型, 则将字符进行分割, 在字符间加空格输入
//    -例子: 输入hello则打印h e l l o
//限制最长只接受32位
//要求可循环输入
//输入exit或-1则退出程序
//要求: 考虑健壮性
public class Q2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("please enter a character:");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (input.length() < 32){
            Pattern pattern = Pattern.compile("[1-9]?");
            if (input.equals("exit")|| input.equals("-1")) {
                System.out.println("退出程序");
                break;
            }
            else if (pattern.matcher(input).matches()) {
                System.out.println("hello"+input);
            } else {
                String output = getFileAddSpace(input);
                System.out.println(output);
            }
        }else {
                System.out.println("限制最长只接受32位输入");
            }


        }
    }

    public static String getFileAddSpace(String replace){
        String regex = "(.{1})";
        replace = replace.replaceAll(regex,"$1 ");
        return replace;
    }
}
