public class Campfire0021 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 合并两个升序链表
     * */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode cur = result;
        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            cur = cur.next;
        }

        while(list1 != null) {
            cur.next = new ListNode(list1.val);
            list1 = list1.next;
            cur = cur.next;
        }

        while(list2 != null) {
            cur.next = new ListNode(list2.val);
            list2 = list2.next;
            cur = cur.next;
        }

        return result.next;
    }
}
