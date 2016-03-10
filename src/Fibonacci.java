/**
 * Created by toryang on 16/3/9.
 */

/**
 * 题目描述:
 *
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 *
 */
public class Fibonacci {
    /**
     * 传统递归,使用较大的数测试会出现stack overflow的错误;
     * @param n
     * @return
     */
    public int Fibonacci1 (int n){
        if (n == 0 || n==1){
            return n;
        }else {
            return Fibonacci1(n-1) + Fibonacci1(n-2);
        }
    }

    /**
     * 动态规划改进:
     * 时间复杂度降低,但是增加空间复杂度
     *
     */
    public int Fibonacci2(int n){
        int[] record = new int[n+1];

        if (n == 0 || n== 1){
            return n;
        }
        record[0] = 0;
        record[1] = 1;
        for (int i = 2;i<n+1;i++){
            record[i] = record[i-1] + record[i-2];
        }

        return record[n];

    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.Fibonacci2(44));
        System.out.println(fibonacci.Fibonacci1(100));

    }


}
