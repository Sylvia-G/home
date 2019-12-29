package day01;

import static day01.Topic9.arrayInt1;

/**
 * 10.基于9中定义的数组，实现数组内容的基本排序，冒泡即可
 * @Author: Sylvia-G
 * 参考链接：https://www.cnblogs.com/shen-hua/p/5422676.html
 */

public class Topic10 {
    public static void main(String[] args) {
        int[] before = arrayInt1(10, false);
        System.out.print("排序前:");
        for (int i1 : before) {
            System.out.print(i1 + " ");
        }

        int[] after = bubbleSort(before);
        System.out.print("\n排序后:");
        for (int i1 : after) {
            System.out.print(i1 + " ");
        }

    }

    /**
     * 写了2遍没写对
     * 这里的逻辑其实是外层循环控制排序趟数(str.length-1),内层循环控制每一趟排序多少次
     * 不要记代码，就记住两层循环怎么控制趟数 -- 外层: 每个元素都要判断所以length-1次, 内层: 外层当前index后面的都需要比较判断所以length-1-i
     * @param value
     * @return
     */
    public static int[] bubbleSort(int[] value){
            int[] str = value.clone();
            //外层循环控制排序趟数, length-1
            for(int i=0; i<str.length-1; i++){
                //内层循环控制每一趟排序多少次, length-1-i
                for(int j=0; j<str.length-1-i; j++){
                    if (str[j] >= str[j+1]){
                        int temp = str[j];
                        str[j] = str[j+1];
                        str[j+1] =temp;
                    }
                }
            }
            return str;

}
}
