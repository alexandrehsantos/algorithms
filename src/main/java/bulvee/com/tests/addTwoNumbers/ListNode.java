package bulvee.com.tests;
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

    public String toString(){
        String list = val + " ";
        ListNode node = next;

        while(node != null){
            list += " -> " + node.val;
            node = node.next;
        }
        return list;
    }
}
