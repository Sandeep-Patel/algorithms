package linkedlist.listnode;

import linkedlist.ListNode;

import java.util.Arrays;

/**
 * Remvove nth from end
 */
public class RemvoeNthFromEnd {
    public static void main(String[] args) {
        ListNode head = ListNode.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6));
        ListNode header = removeNthFromEnd(head, 3);
        ListNode.printList(header);
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode start = head;


        ListNode headFollow = head;

        for (int i = 1; i < n; i++)
            head = head.next;
        if (head.next == null)
            return headFollow.next;
        while (head.next.next != null) {
            head = head.next;
            headFollow = headFollow.next;
        }
        headFollow.next = headFollow.next.next;
        return start;
    }
}
