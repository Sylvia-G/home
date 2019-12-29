package day01;

import org.junit.Test;

import static day01.Topic10.bubbleSort;
import static day01.Topic9.arrayInt1;
import static day01.Topic9.arrayInt2;

/**
 * 11.基于9中定义的数组，实现数组内容的二分查找.查找一个给定的元素
 * 参考链接：https://blog.csdn.net/maoyuanming0806/article/details/78176957
 * @Author: Sylvia-G
 */
public class Topic11 {

    /**
     * 测试方法, Topic9.arrayInt()提供的是偶数位的数组
     */
    @Test
    public void test(){
        System.out.println("---------偶数位数组---------");
        int[] arrayEven = arrayInt1(10, true);
        for (int i = 0; i < arrayEven.length; i++) {
            System.out.print(arrayEven[i]+",");
        }
        System.out.println();
        // 小于中间位置：1
        System.out.println("1的位置: "+ binarySearch(bubbleSort(arrayEven), 1));
        //等于中间位置：4
        System.out.println("4的位置: "+ binarySearch(bubbleSort(arrayEven), 4));
        //大于中间位置：8
        System.out.println("8的位置: "+ binarySearch(bubbleSort(arrayEven), 8));
        //找不到key：199
        System.out.println("199的位置: "+ binarySearch(bubbleSort(arrayEven), 199));

        System.out.println("---------奇数位数组---------");
        int[] arrayOdd = arrayInt1(11, true);
        for (int i = 0; i < arrayOdd.length; i++) {
            System.out.print(arrayOdd[i]+",");
        }
        System.out.println();
        // 小于中间位置：1
        System.out.println("1的位置: "+ binarySearch(bubbleSort(arrayOdd), 1));
        //等于中间位置：5
        System.out.println("5的位置: "+ binarySearch(bubbleSort(arrayOdd), 5));
        //大于中间位置：8
        System.out.println("8的位置: "+ binarySearch(bubbleSort(arrayOdd), 8));
        //找不到key：199
        System.out.println("199的位置: "+ binarySearch(bubbleSort(arrayOdd), 199));

        System.out.println("---------乱序数组---------      remark: 题目要求二分查找, 一定是有序的, 该场景不存在");
        int[] arrayOutOfOrder = arrayInt2();
        for (int i = 0; i < arrayOutOfOrder.length; i++) {
            System.out.print(arrayOutOfOrder[i]+",");
        }
        System.out.println();
        // 小于中间位置：68
        System.out.println("68的位置: "+ binarySearch(bubbleSort(arrayOutOfOrder), 68));
        //等于中间位置：23
        System.out.println("23的位置: "+ binarySearch(bubbleSort(arrayOutOfOrder), 23));
        //大于中间位置：88
        System.out.println("88的位置: "+ binarySearch(bubbleSort(arrayOutOfOrder), 88));
        //找不到key：199
        System.out.println("199的位置: "+ binarySearch(bubbleSort(arrayOutOfOrder), 199));
    }


    public  static int binarySearch(int[] arrlist, int key){
        int low=0;
        int hight=arrlist.length-1;
        int mid;

        if (key<arrlist[low] || key>arrlist[hight] || low>hight){
            return -1;
        }

        while (low<=hight){
            mid=(low+hight)/2;
            if (key>arrlist[mid]){
                low=mid+1;
            }else if (key<arrlist[mid]){
                hight=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
