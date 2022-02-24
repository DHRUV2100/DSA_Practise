class Solution {

    public ListNode midOfLL(ListNode head) {
        if(head==null)
            return null;
        //using slow and fast pointer approach
        NodeHead slow=head;
        NodeHead fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            // move slow by 1 and fast by 2
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode mergeSortLL(ListNode h1,ListNode h2) {
        Listnode newHead= new ListNode(-1);
        ListNode curr1 = h1;
        ListNode curr2 = h2;
        ListNode temp = newHead;
        while(curr1!=null && curr2!=null)
        {
            if(curr1.val<=curr2.val)
            {
                temp.next=curr1;
                curr1=curr1.next;
            }
            else 
            {
                temp.next=curr2;
                curr2=curr2.next;
            }
            temp=temp.next;
        }
        if(curr1!=null)
        {
            temp.next=curr1;
        }
        else if(curr2!=null)
        {
            temp.next=curr2;
        }
        return newHead.next;
    }

    public ListNode sortList(ListNode head) {
        //Base Case
        if(head == null || head.next==null)
            return head;
        //expectation
        ListNode mid=midOfLL(h1);
        ListNode h2=mid.next;
        mid.next=null;
        //faith
        ListNode L=sortList(h1);    
        ListNode R=sortList(h2);
        //exp
        NodeList ans = mergeSortLL(L,R);
        return ans;   
    }
}