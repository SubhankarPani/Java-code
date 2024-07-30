package StringsPractice;

public class ListNode {
    int val;
    ListNode next;

    // Default constructor
    ListNode() {}

    // Constructor with a value
    ListNode(int val) {
        this.val = val;
    }

    // Constructor with a value and a next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=new ListNode();
        ListNode cur=temp;
        head=head.next;
        int sum=0;
        while(head!=null){
            if(head.val==0){
                cur.next=new ListNode(sum);
                cur=cur.next;
                sum=0;
            }
            sum+=head.val;
            head=head.next;
        }
        return temp.next;// Return the merged list, starting after the dummy node
    }

    public static void main(String[] args) {
        // Create a sample linked list: 0 -> 1 -> 2 -> 0 -> 3 -> 4 -> 0
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(0);

        // Merge the nodes
        Solution solution = new Solution();
        ListNode result = solution.mergeNodes(head);

        // Print the resulting merged list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
