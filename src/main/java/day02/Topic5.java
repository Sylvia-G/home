package day02;

/**
 * 作业5:实现一个杨辉三角
 *
 * 要求: 打印多少行由方法入参传入
 *
 * 杨辉三角的样式:
 *
 *               1
 *              1 1
 *             1 2 1
 *            1 2 3 2 1
 *           1 2 3 5 3 2 1
 * @author haoc
 */
public class Topic5 {
    public static void main(String[] args) {
        Topic5 topic5 =  new Topic5();
        topic5.pascalsTriangle(5);

    }

    private void pascalsTriangle(int num){
        final int n = num;
        //分配杨辉三角数组
        int[][] odds = new int[n+1][];
        for (int i=0; i<=n; i++){
            odds[i] = new int[i+1];
        }

        //填充杨辉三角
        for (int i=0; i<odds.length; i++){
            for (int j=0; j<odds[i].length; j++){
                //计算二项式系数
                int lotOdds=1;
                for(int k=1;k<=j;k++){
                    lotOdds = lotOdds * (i-k+1)/k;
                }
                odds[i][j]=lotOdds;
            }
        }

        //打印杨辉三角
        for (int[] r:odds){
            for (int o:r){
                System.out.printf("%4d",o);
            }
            System.out.println();
            }

        }
    }
