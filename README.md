#剑指Offer笔试题

*题目来源：*[牛客网](http://www.nowcoder.com/ta/coding-interviews?page=1)

### 题目一：二维数组中的查找
*描述：*  
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。  

*解题思路：*  [代码](https://github.com/ToryangChen/OfferTest/blob/master/src/MatrixSearch.java)
将target与二维数组array第一行最后一个数做比较,如果target大于该行数,则不考虑第一行,相反不考虑最后一列,相等返回true； 

### 题目二: 替换空格
*描述:*
请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

*解题思路:* [代码](https://github.com/ToryangChen/OfferTest/blob/master/src/SpaceReplace.java)

解法一: 遍历
解法二: 直接使用replaceAll函数

### 题目三: 从尾到头打印链表

*描述:*  
输入一个链表，从尾到头打印链表每个节点的值。 

*解题思路:* [代码](https://github.com/ToryangChen/OfferTest/blob/master/src/ListNodeTest.java)
解法一: 使用栈的方法解决;
解法二: 使用递归的方法,但是实质还是栈:

### 题目四: 重建二叉树
*描述*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回;

*解题思路:* [代码](https://github.com/ToryangChen/OfferTest/blob/master/src/TreeNodeTest.java)
 
 * 取前序遍历第一个数字,该数字是跟节点;
 * 在中序遍历中找到跟节点,则该跟节点左边是左子数,右边为右子数;
 * 以此遍历,进行递归;

### 题目五: 用栈实现队列 
*描述*
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

*解题思路:*[代码](https://github.com/ToryangChen/OfferTest/blob/master/src/Stack2Range.java)

 * 将所有数先存入第一个栈中;
 * 第一个栈出栈,按照出栈顺序存入第二个栈中;
 * 再从第二个栈中出栈,即得到队列;
 
### 题目六: 旋转数组的最小数字
*描述:*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减序列的一个旋转，输出旋转数组的最小元素。例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1;

*解题思路:* [代码](https://github.com/ToryangChen/OfferTest/blob/master/src/RotateArray.java)


### 题目七: 斐波那契数列

*描述:*
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项;

*解题思路:*
 这里实现的斐波那契数列不使用递归的算法,递归算法重复计算的次数很多,当输入n值很大时会出现stackOverflow报错;
 所以这里采用的是一个简单的动态规划(数组遍历)
 
### 题目八: 跳台阶/ 变态跳台阶

*描述:*
 1, 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 
 2, 如果青蛙一次可以跳上1级台阶, 2级台阶........ n级台阶. 求该青蛙跳上一个n级台阶总共有多少中跳法.
 
*解题思路:* [代码](https://github.com/ToryangChen/OfferTest/blob/master/src/JumpFloorTest.java)
 1, 递归,斐波那契数列
 
 2, 递归思路:
 
 * 因为n级台阶，第一步有n种跳法：跳1级、跳2级、到跳n级
 * 跳1级，剩下n-1级，则剩下跳法是f(n-1)
 * 跳2级，剩下n-2级，则剩下跳法是f(n-2)
 * 所以f(n)=f(n-1)+f(n-2)+...+f(1)
 * 因为f(n-1)=f(n-2)+f(n-3)+...+f(1)
 * 所以f(n)=2*f(n-1)
 
### 题目八: 矩形覆盖

*描述:*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

*解题思路:*[代码](https://github.com/ToryangChen/OfferTest/blob/master/src/CoverRec.java)
通过分析,这里依旧时斐波那契数列,不做赘述;

### 题目九: 二进制中1的个数

*描述:*
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

*解题思路:* [代码](https://github.com/ToryangChen/OfferTest/blob/master/src/NumberOf1Tesr.java)
 解法一: 这是一个比较讨巧的做法,将二进制转换为String,同时将0全部用替换为"",然后返回String长度;
 解法二: 将n与(n-1)相与,会将n最右边的1去掉;
        举例: n=10  1010&1001=1000 --> 1000&0111=0000; 两次,即10的二进制数中有两个1;
        
### 题目十: 数值的整数次方

*描述:*
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

*解题思路:* [代码](https://github.com/ToryangChen/OfferTest/blob/master/src/PowerTest.java)

先判断指数的正负性,然后直接数学思路进行数相乘;
当然也可以直接使用Math.power(base,exponent);