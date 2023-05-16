package bulvee.com.tests;

public class AddTwoNumbers {
    public static void main(String[] args) {

        // l1 =[9,9,9,9,9,9,9]
        // l2 =[9,9,9,9]

        ListNode next7 = new ListNode(9);
        ListNode next6 = new ListNode(9, next7);
        ListNode next5 = new ListNode(9, next6);
        ListNode next4 = new ListNode(9, next5);
        ListNode next3 = new ListNode(9, next4);
        ListNode next2 = new ListNode(9, next3);
        ListNode next1 = new ListNode(9, next2);
        ListNode l1 = new ListNode(9, next1);

        ListNode nextl24 = new ListNode(9);
        ListNode nextl23 = new ListNode(9, nextl24);
        ListNode nextl22 = new ListNode(9, nextl23);
        ListNode nextl21 = new ListNode(9, nextl22);
        ListNode l2 = new ListNode(9, nextl21);


        ListNode added = addTwoNumbers(l1, l2);
        System.out.println(added);
        /*
         * while(added != null){
         * System.out.println(added.val);
         * added = added.next;
         * }
         */

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempHead = new ListNode(0);
        ListNode currentNode = tempHead;

        int toIncrease = 0;

        while (l1 != null || l2 != null || toIncrease != 0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            System.out.println("X: " + x);
            System.out.println("Y:" + y);
            int sum = toIncrease + x + y;
            System.out.println(sum);
            toIncrease = sum / 10;
            int valueToNode = sum % 10;
            currentNode.next = new ListNode(valueToNode);
            currentNode = currentNode.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return tempHead.next;

    }

}
