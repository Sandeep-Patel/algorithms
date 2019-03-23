package linkedlist.mergelist;

import linkedlist.ListNode;

import java.util.Arrays;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = ListNode.createLinkedList(Arrays.asList(1, 2, 4));
        ListNode list2 = ListNode.createLinkedList(Arrays.asList(1, 1, 2));

        ListNode result = mergeTwoLists(list1, list2);

        ListNode.printList(result);

    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}
