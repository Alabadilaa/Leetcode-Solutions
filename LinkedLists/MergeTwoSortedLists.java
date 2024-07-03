package LinkedLists;

public class MergeTwoSortedLists {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode(0);
        ListNode res = newList;
        ListNode temp;

        while(list1 != null && list2 != null) {
            // res = res.next;
            // res.val = Math.max(list1.val, list2.val);
            if (list1.val < list2.val) {
                temp = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                temp = new ListNode(list2.val);
                list2 = list2.next;
            }
            if (res == null) {
                res = temp;
                res = res.next;
            } else {
                res.next = temp;
                res = res.next;
            }
        }
        if (list2 != null) {
            res.next = list2;
        } else if (list1 != null) {
            res.next = list1;
        }
        return newList.next;
    }
}

