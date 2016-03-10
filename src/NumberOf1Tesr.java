/**
 * Created by toryang on 16/3/9.
 */

/**
 * 题目描述:
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NumberOf1Tesr {

    public static int NumberOf1(int n){
        int count = 0;
        while (n!=0){
            n = n&(n-1);
            count++ ;
        }

        return count;
    }

    /**
     * 直接使用库函数:
     * @param n
     * @return
     */
    public static int Number1(int n) {
        return Integer.toBinaryString(n).replaceAll("0","").length();
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(5));
        System.out.println(Number1(5));
    }
}
