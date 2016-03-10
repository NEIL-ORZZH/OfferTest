/**
 * Created by toryang on 16/3/8.
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述
 * 输入一个链表，从尾到头打印链表每个节点的值。
 *
 * 输入为链表的表头,输出为需要打印的新链表的表头
 *
 */

public class ListNodeTest {
    /**
     * 使用栈的方法解决
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        Stack<Integer> stack = new Stack<Integer>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }

        return list;
    }

    /**
     * 使用递归的方法,但是实质还是栈
     * @param listNode
     * @return
     */

    public ArrayList<Integer> printList(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode node = listNode;
        if (node != null){
            if (node.next != null){
                list = printList(node);
            }

            list.add(node.val);
        }

        return list;
    }
}
