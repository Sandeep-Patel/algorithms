package linkedlist.sort;

import linkedlist.ListNode;

import java.util.Arrays;

/**
 * Sort list by value
 * <p>
 * Example:
 * <p>
 * Input: 3->1->5->4->2
 * Output: 1->2->3->4->5
 */

public class SortLinkList {
    public static void main(String[] args) {
        ListNode list = ListNode.createLinkedList(Arrays.asList(3, 1, 5, 4 ,2));

        ListNode result = sortLinkList(list);

        ListNode.printList(result);

    }


    public static ListNode sortLinkList(ListNode list) {
        //TODO:
        return list;
    }

}
