package org.example.home10;

public class ReversedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode tempHead = head;
        head = head.next;
        tempHead.next = null;
        while (head != null) {
            ListNode headNext = head.next;
            head.next = tempHead;
            tempHead = head;
            head = headNext;
        }
        return tempHead;

    }
}
