class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int sz = 0;
        ListNode temp = head;

        // find size
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // remove first node
        if (n == sz) {
            return head.next;
        }

        int i = 1;
        int iToFind = sz - n;
        ListNode prev = head;

        // move to (sz-n)th node
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // delete node
        prev.next = prev.next.next;

        return head;
    }
}
