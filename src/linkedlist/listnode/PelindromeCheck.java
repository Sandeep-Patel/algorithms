package linkedlist.listnode;

import linkedlist.ListNode;

import java.util.Arrays;

/**
 * Remvove nth from end
 */
public class PelindromeCheck {
    public static void main(String[] args) {
        ListNode head = ListNode.createLinkedList(Arrays.asList(1,2,1));
        boolean result = isPalindrome(head);
        System.out.println("isPalindrome = " + result);
    }


    public static boolean isPalindrome(ListNode head) {
        boolean res = isPendrome(head, getLast(head));
        return res;
    }

    private static boolean isPendrome(ListNode head, ListNode last) {
       if(head == null) {
           return true;
       }
        if(head.val == last.val) {
           if(head.next !=null) {
               head = head.next;
               return isPendrome(head, getLast(removeLast(head)));
           }
           return true;
       } else {
           return false;
       }
    }

    private static ListNode removeLast(ListNode head) {
        while (head.next != null && head.next.next != null) {
            head = head.next;
        }
        head.next = null;

        return head;
    }
    private static ListNode getLast(ListNode head) {
        while (head != null && head.next != null) {
            head = head.next;
        }

        return head;
    }


}
