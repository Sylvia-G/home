package day02;

import java.util.Stack;

/**
 * 作业4: 封装一个数组对象(暂时用int型即可)
 *
 * 可先定义个数组看下,比如int[],有哪些方法提供,太少了
 *
 * 要求实现: 数组类
 *
 * - new 时传入指定大小
 *
 * - 可以添加元素
 *
 * - 可以删除元素
 *
 * - 可以根据给定元素,找到索引位置
 *
 * - 并支持跨度寻找,如find(1234,5),即夸过5个索引之后寻找
 *
 * - 实现对数组的遍历功能
 *
 * - 实现判断数组是否为空
 *
 * - 不理解,看下Topic6,栈的设计
 *
 * @author haoc
 */
public class Topic4 {
    public static void main(String[] args) {
        // new时传入指定大小
        IArray array = new IArray(5);

        // 添加元素
        array.add(100);
        array.add(99);
        array.add(98);
        array.add(97);
        array.add(96);
        // 数组遍历
        array.toString();

        // 按照下标删除元素
        array.delIndex(0);
        array.delIndex(100);    // 删除不存在下标
        array.toString();

        // 按照指定元素删除元素
        array.delValue(97);
        array.delValue(12);    // 删除不存在元素
        array.toString();

        // 根据给定元素,找到索引位置
        System.out.println("元素99的位置是:" + array.searchIndex(99));
        System.out.println("元素12的位置是:" + array.searchIndex(12));    // 查找不存在元素
        array.toString();

        // 根据给定元素, 跨度寻找索引位置
        System.out.println("元素96的位置是:" + array.acrossSearchIndex(96,2));
        System.out.println("元素12的位置是:" + array.acrossSearchIndex(12,2));    // 查找不存在元素
        array.toString();

        // 判断数组是否为空
        System.out.println("数组不为空：" + array.isNotEmpty());

    }
}

class IArray{
    int count;
    int indexFlag=0;
    int[] iarray;

    public IArray(int count) {
        this.count = count;
        this.iarray = new int[count];
    }

    public void add(int value){
        this.iarray[this.indexFlag]=value;
        this.indexFlag ++;
   }

   public void  delIndex(int index){
        if (index < this.indexFlag && index >=0){
            this.indexFlag --;
            for (int i = index; i < this.indexFlag; i++) {
                this.iarray[i] = this.iarray[i+1];
            }

        }else {
            System.out.println("index下标越界");
        }
   }

   public  void delValue(int value){
       int index=-1;
       for (int i = 0; i < this.indexFlag; i++) {
           if (this.iarray[i] == value) {
               index = i;
               break;
           }
       }
       if (index < this.indexFlag && index >=0){
           this.indexFlag --;
           for (int i = index; i < this.indexFlag; i++) {
               this.iarray[i] = this.iarray[i+1];
           }

       }else {
           System.out.println("给定元素不存在");
       }

   }

    /**
     *
     * @param value
     * @return
     * 二分查找要求有序列, 这里使用会令结果不准
     * 实现方法只考虑给定元素只出现一次, 或返回给定元素第一次出现的场景
     */
   public int searchIndex(int value) {
       int index=-1;
       for (int i = 0; i < this.indexFlag; i++) {
           if (this.iarray[i] == value) {
               index = i;
               break;
           }
       }
       return index;
   }

   public int acrossSearchIndex(int value, int step){
       int index=-1;
       for (int i = step; i < this.indexFlag; i++) {
           if (this.iarray[i] == value) {
               index = i;
               break;
           }
       }
       return index;
   }

    /**
     * 重写方法实现数组遍历
     * @return
     */
    @Override
    public String toString() {
        for (int i = 0; i < this.indexFlag; i++) {
            System.out.println("位置: " +  i + ", 值: " + this.iarray[i] );
        }
        return null;
    }

    public boolean isNotEmpty(){
        boolean len = false;
        if (this.indexFlag != 0){
            len = true;
        }
        return len;
    }
}

