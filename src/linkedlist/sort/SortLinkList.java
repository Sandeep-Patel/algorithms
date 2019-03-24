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

//TODO: Not working
public class SortLinkList {
    public static void main(String[] args) {
        ListNode list = ListNode.createLinkedList(Arrays.asList(7,6,5,4,3,2,1));
        ListNode result = sortLinkList(list);
        ListNode.printList(result);

        /*ListNode listRecur = ListNode.createLinkedList(Arrays.asList(4,1,6,3,5,2));
        ListNode resultRecur = sortLinkListRecur(listRecur);
        ListNode.printList(resultRecur);*/

    }

    public static ListNode sortLinkListRecur(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;

        head = sortRecur(head, next);

        return head;
    }

    public static ListNode sortRecur(ListNode head, ListNode next) {

        if (head == null || head.next == null) {
            return head;
        }

        head = next;
        next = next.next;
        next = sortRecur(head, next);


        if(head != null && next!=null && next.val < head.val) {
            head.next = next.next;
            next.next = head;
            head = next;
        }

        return head;
    }

    public static ListNode sortLinkList(ListNode head) {

        if(head== null || head.next == null ) {
            return head;
        }
        boolean notDone = true;
        ListNode cur;
        ListNode prev;
        ListNode temp;


        while (notDone) {
            notDone = false;
            cur = head;

            while (cur.next != null) {
                prev = cur;
                cur = cur.next;

                if (cur.next != null && cur.val > cur.next.val) {
                    prev.next = cur.next;
                    temp = cur.next.next;
                    cur.next.next = cur;
                    cur.next = temp;
                    notDone = true;
                }
            }
        }

        return head;

    }

}
