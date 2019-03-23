package linkedlist;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }


    /**
     * Creates linked list as first element as header and returns header
     * @param list
     * @return
     */
    public static ListNode createLinkedList(List<Integer> list) {
        int count = list.size()-1;
        ListNode tail = new ListNode(list.get(count--));
        ListNode head = null;
        while(count >= 0 ) {
            int val = list.get(count);
            head = new ListNode(val, tail);
            tail= head;
            count--;
        }
        printList(head);
        return head;
    }

    public static void printList(ListNode header) {
        System.out.print("[");
        while(header != null) {
            if(header.next== null) {
                System.out.print(header.val);
            } else {
                System.out.print(header.val + ", ");
            }
            header=header.next;
        }
        System.out.println("]");
    }
}