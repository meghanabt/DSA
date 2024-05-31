/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode t1= list1;
        ListNode t2= list2;

        ListNode dummyNode= new ListNode(-1, null);
        ListNode temp=dummyNode;

        while(t1!= null && t2!=null)
        {
            if(t1.val <=t2.val)
            {
                ListNode newNode=t1;
                temp.next=newNode;
                t1=t1.next;
                temp=temp.next;
                
            }
            else
            {
                ListNode newNode = t2;
                temp.next= newNode;
                t2= t2.next;
                temp= temp.next;

            }
        }

        if(t1!=null)
        {
            while(t1!=null)
            {
                temp.next= t1;
                temp=temp.next;
                t1=t1.next;
            }
        }

        if(t2!=null)
        {
            while(t2 !=null)
            {
                temp.next=t2;
                t2=t2.next;
                temp= temp.next;

            }
        }
        return dummyNode.next;

        
    }
}