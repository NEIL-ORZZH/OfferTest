/**
 * Created by toryang on 16/3/9.
 */

/**
 * 题目描述:
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 *
 */
public class PowerTest {
    /**
     * 解决思路:数学方法;
     * @param base
     * @param exponent
     * @return
     */
    public static double power(double base,int exponent){
        double result = base;
        if(exponent == 0){
            return 1;
        }else if(exponent>0){
            for(int i=1;i<exponent;i++){
                result *= base;
            }
            return result;
        }else{
            for(int i=1;i<(-exponent);i++){
                result *= base;
            }
            return 1/result;
        }
    }

    /**
     *
     * 直接使用库函数
     *
     */
    public static double power2(double base,int exponent){
        return Math.pow(base,exponent);
    }

    public static void main(String[] args) {
        System.out.println(power2(1.2,10));
        System.out.println(power(1.2,10));
    }
}
