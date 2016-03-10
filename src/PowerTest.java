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
    public double power(double base,int exponent){
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

}
