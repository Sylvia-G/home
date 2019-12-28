package day01;

/**
 * 10.基于9中定义的数组，实现数组内容的基本排序，冒泡即可
 * 参考链接：https://www.cnblogs.com/shen-hua/p/5422676.html
 */

public class Topic10 {
    public static void main(String[] args) {
        int before[] = Topic9.arrayInt();
        System.out.println("排序前:\n");
        for (int i=0; i<before.length; i++){
            System.out.print(before[i] + " ");
        }

        int after[] = bubbleSort(before);
        System.out.println("\n排序后:\n");
        for (int i=0; i<after.length; i++){
            System.out.print(after[i] + " ");
        }

    }

    public static int[] bubbleSort(int[] value){
            int[] str1 = value.clone();
            //外层循环控制排序趟数, length-1
            for(int i=0; i<str1.length-1; i++){
                //内层循环控制每一趟排序多少次, length-i-1
                for(int j=0; j<str1.length-1-i; j++){
                    if (str1[j] >= str1[j+1]){
                        int temp = str1[j];
                        str1[j] = str1[j+1];
                        str1[j+1] =temp;
                    }
                }
            }

            return str1;

}
}
