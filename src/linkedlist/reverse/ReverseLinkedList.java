package linkedlist.reverse;

import linkedlist.ListNode;

import java.util.Arrays;

/**
 * Reverse linked list
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = ListNode.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
        ListNode header = reverseLinkedList(head);
        ListNode.printList(header);

        ListNode head2 = ListNode.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
        ListNode.printList(reverseLinkedListRecursion(head2));


    }


    public static ListNode reverseLinkedList(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode tmp = head;


        while (tmp.next != null) {
            head = tmp.next;
            tmp.next = dummy.next;
            dummy.next = head.next;
            dummy.next = tmp;
            tmp = head;
        }
        return dummy.next;
    }

    public static ListNode reverseLinkedListRecursion(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        ListNode newNode = reverseLinkedListRecursion(next);
        next.next = head;
        head.next = null;

        return newNode;
    }


}
