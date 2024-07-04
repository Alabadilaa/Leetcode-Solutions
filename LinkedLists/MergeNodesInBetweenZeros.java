package LinkedLists;

public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        int sum = 0;

        head = head.next;
        while (head != null) {
            if (head.val != 0) {
                sum += head.val;
            } else {
                res.next = new ListNode(sum);
                res = res.next;
                sum = 0;
            }
            head = head.next;
        }

        return dummy.next;
    }
}
