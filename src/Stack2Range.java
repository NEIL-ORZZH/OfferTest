/**
 * Created by toryang on 16/3/8.
 */

import java.util.Stack;

/**
 * 题目描述:
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Stack2Range {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
//        while(!stack2.isEmpty())
//        {
//            return stack2.pop();
//        }
//
//        while(!stack1.isEmpty())
//        {
//            stack2.push(stack1.pop());
//        }
//        return stack2.pop();
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }


    public static void main(String[] args) {
        Stack2Range stack2Range = new Stack2Range();
        for (int i = 0;i<10;i++)
            stack2Range.push(i);
        for (int i = 0;i<10;i++)
            System.out.println(stack2Range.pop());
    }
}
