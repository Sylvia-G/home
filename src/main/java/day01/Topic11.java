package day01;

/**
 * 11.基于9中定义的数组，实现数组内容的二分查找.查找一个给定的元素
 * 参考链接：https://blog.csdn.net/maoyuanming0806/article/details/78176957
 */
public class Topic11 {
    public static void main(String[] args) {
        //小于中间位置：1
        test(1);
        //等于中间位置：21
        test(21);
        //大于中间位置：88
        test(88);
        //找不到key：199
        test(199);

    }

    //测试方法, Topic9.arrayInt()提供的是偶数位的数组
    private static void test(int key){
        int location = binarySearch(Topic10.bubbleSort(Topic9.arrayInt()),key);
        if (location==-1){
            System.out.println("关键字: " + key + "没有找到");
        }else {
            System.out.println("关键字: " + key + "的位置在: " + location);
        }
    }


    public  static int binarySearch(int[] arrlist, int key){
        int low=0;
        int hight=arrlist.length-1;
        int mid=0;

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
