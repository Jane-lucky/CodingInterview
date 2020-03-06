package InterView;

public class AddTwoNumber {

    public ListNode Add(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode curr = node;
        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = (p1 != null) ? p1.val : 0;
            int y = (p2 != null) ? p2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr=curr.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return node.next;
       /* ListNode node = new ListNode(0);
        ListNode p1 = l1, p2 = l2, curr = node;
        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = (p1 != null) ? p1.val : 0;
            int y = (p2 != null) ? p2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return node.next;

        */

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}