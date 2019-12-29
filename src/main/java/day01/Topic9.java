package day01;

import java.util.Random;

/**
 * 9.练习数组的定义，赋值，和初始化.使用int型即可
 * @Author: Sylvia-G
 * */
public class Topic9{
    public static void main(String[] args) {
        int[] a = arrayInt1(10, false);
        for (int i1 : a) {
            System.out.print(i1 + " ");
        }
    }

    protected static int[] arrayInt1(int len, boolean type){
        Random random = new Random();
        int[] arrays = new int[len];

        if (!type){
            for (int i = 0; i < arrays.length; i++) {
            arrays[i] = random.nextInt(100);
            }
        }else{
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = i;
            }
        }
        return arrays;
    }

    protected  static int[] arrayInt2(){
        int[] arrays = new int[10];

        arrays[0]=1;
        arrays[1]=79;
        arrays[2]=42;
        arrays[3]=68;
        arrays[4]=23;
        arrays[5]=88;
        arrays[6]=91;
        arrays[7]=95;
        arrays[8]=88;
        arrays[9]=66;

        return arrays;
    }
}
