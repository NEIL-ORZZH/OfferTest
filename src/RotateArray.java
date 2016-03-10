/**
 * Created by toryang on 16/3/8.
 */

/**
 * 题目描述:
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减序列的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *
 */
public class RotateArray {

    public int minNumberInRotateArray(int [] array) {

        if (array == null || array.length == 0) {
            return 0;
        }
        int index1 = 0;
        int index2 = array.length-1;
        int indexMid = index1;
        while (array[index1]>=array[index2]) {
            if (index2 - index1 == 1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1+index2)/2;
            if (array[index1] == array[index2] && array[indexMid] == array[index1]) {
                return MinInOrder(array,index1,index2);
            }
            if (array[indexMid]>=array[index1]) {
                index1 = indexMid;
            }
            else if (array[indexMid]<=array[index2]) {
                index2 = indexMid;
            }
        }

        return array[indexMid];
    }

    private int MinInOrder(int[] array, int index1, int index2) {
        // TODO Auto-generated method stub
        int result = array[index1];
        for (int i = index1+1; i <= index2; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testarray = {3,4,5,1,2};
        RotateArray rotateArray = new RotateArray();
        int min = rotateArray.minNumberInRotateArray(testarray);
        System.out.println(min);
    }
}
