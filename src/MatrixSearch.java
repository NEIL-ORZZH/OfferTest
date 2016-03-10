/**
 * Created by toryang on 16/3/8.
 */


/**
 * 问题描述:
 *
 *   在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 输入描述:
 * array: 待查找的二维数组
 * target: 查找的数字
 *
 * 输出描述:
 * 查找到返回true,查找不到返回false
 */
public class MatrixSearch {

    /**
     * 解决方法:
     * 将target与二维数组array第一行最后一个数做比较,如果target大于该行数,则不考虑第一行,相反不考虑最后一列,相等返回true
     *
     * @param array
     * @param target
     * @return
     */

    public static boolean find(int[][] array,int target){
        if (array==null || array.length<1 ||  array[0].length<1){
            return false;
        }

        int rows = array.length;
        int cols = array[1].length;

        int row = 0;
        int col = cols - 1;

        while (row<rows && col<cols && row>=0 && col>=0){
            if (array[row][col] == target){
                return true;
            }else if (array[row][col] > target){
                col--;
            }else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };

        System.out.println(find(array,22));
        System.out.println(find(array,12));
        System.out.println(find(null,10));
    }


}
