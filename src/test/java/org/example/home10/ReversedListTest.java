package org.example.home10;

import org.junit.Assert;
import org.junit.Test;

public class ReversedListTest {
    private final ReversedList reversedList = new ReversedList();

    @Test
    public void ReversedListPositive() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode expected = node3;
        ListNode actual = reversedList.reverseList(node1);
        Assert.assertEquals(expected, actual);
    }
}
