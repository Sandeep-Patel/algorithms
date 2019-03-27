package linkedlist;

import java.math.BigInteger;
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {

        ListNode list = ListNode.createLinkedList(Arrays.asList(3,9,9,9,9,9,9,9,9,9));
        ListNode list2 = ListNode.createLinkedList(Arrays.asList(7));
        ListNode result = addTwoNumbers(list,list2);
        ListNode.printList(result);

        /*ListNode listRecur = ListNode.createLinkedList(Arrays.asList(4,1,6,3,5,2));
        ListNode resultRecur = sortLinkListRecur(listRecur);
        ListNode.printList(resultRecur);*/

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger val1 = findVal(l1);
        BigInteger val2 = findVal(l2);


        BigInteger total = val1.add(val2);

        String totalStr = String.valueOf(total);

        ListNode l = null;
        ListNode head = null;
        for(int i=0;i<totalStr.length(); i++) {
            ListNode newNode = new ListNode(Integer.valueOf(totalStr.substring(i,i+1)));
            if(l==null) {
                l = newNode;
                head = newNode;
            } else {
                l.next = newNode;
                l=l.next;
            }
        }
        return head;
    }


    private static BigInteger findVal(ListNode l1) {
        String total = "";
        while(l1!=null) {
            total = total + l1.val;
            l1 = l1.next;
        }
        return "".equals(total)?BigInteger.ZERO:new BigInteger(total);
    }


}