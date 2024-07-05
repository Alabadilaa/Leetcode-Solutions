package LinkedLists;

public class FindMinMaxBetweenCritNodes {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int i = 1;
        int first = -1, last = -1;
        int max = -1;
        int min = Integer.MAX_VALUE;

        while (head.next != null && head.next.next != null) {
            boolean isCrit = (head.val < head.next.val && head.next.val > head.next.next.val) || (head.val > head.next.val && head.next.val < head.next.next.val);

            if (isCrit) {
                if (first == -1) {
                    first = i;
                } else {
                    min = Math.min(min, i - last);
                    max = i - first;
                }
                last = i;
            }
            i++;
            head = head.next;
        }

        if (min == Integer.MAX_VALUE) return new int[] {-1, -1};
        
        return new int[] {min, max};
    }
}

