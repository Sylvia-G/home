package day01;

/**
 * 9.练习数组的定义，赋值，和初始化.使用int型即可
 * */
public class Topic9 {
    public static void main(String[] args) {
        int a[] = arrayInt();
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static int[] arrayInt(){
        int[] arr = new int[10];
        arr[0]=9;
        arr[1]=67;
        arr[2]=1;
        arr[3]=0;
        arr[4]=83;
        arr[5]=50;
        arr[6]=99;
        arr[7]=21;
        arr[8]=9;
        arr[9]=88;

        return arr;
    }
}
