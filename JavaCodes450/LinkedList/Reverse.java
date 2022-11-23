class Reverse{
    ListNode head;
    public class ListNode {
            int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode reverseList(ListNode head) {
if(head==null || head.next==null)
            return head;
        
            ListNode tail=reverseList(head.next);
            head.next.next=head;
            head.next=null;
            
        
        return tail;
}
        ListNode curr=head;
        ListNode prev=null;

        public void ReverseIterate(ListNode head){
            while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            }
        }
}
// ref : https://stackoverflow.com/questions/37848186/how-to-understand-head-next-next-head-for-reverse-single-list-by-recursion#:~:text=The%20head%2D%3Enext%2D%3E,the%20opposite%20direction%20as%20before).