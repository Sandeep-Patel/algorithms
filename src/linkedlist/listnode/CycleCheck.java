package linkedlist.listnode;

import linkedlist.ListNode;

import java.util.Arrays;

/**
 * Remvove nth from end
 */
public class CycleCheck {
    public static void main(String[] args) {
        ListNode head = ListNode.createLinkedList(Arrays.asList(1,2,3,4,5));
        getLast(head).next = head.next;  //add cycle
        boolean result = hasCycle(head);
        System.out.println("hasCycle = " + result);
    }


    public static boolean hasCycle(ListNode head){
        if(head == null || head.next == null) return false;
        if(head.next == head) return true;
        ListNode nextNode = head.next;
        head.next = head;
        boolean isCycle = hasCycle(nextNode);
        return isCycle;
    }


    private static ListNode getLast(ListNode head) {
        while (head != null && head.next != null) {
            head = head.next;
        }

        return head;
    }

}
