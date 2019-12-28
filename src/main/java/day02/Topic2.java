package day02;

/**
 * 输出1到100以内的所有质数
 *
 * 质数: 只能被1和自身整除的数,如3,7,11,13等
 *
 * @author haoc
 */
public class Topic2 {
    public static void main(String[] args) {
        int i, j;
        for (i=2;i<=100;i++){
            for(j=2; j<i; j++){
                if(i%j == 0){
                    break;
                }
            }
            if (j>=i){
                System.out.print(i + " ");
            }
        }
    }

}
