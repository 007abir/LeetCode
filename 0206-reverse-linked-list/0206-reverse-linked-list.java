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
    public ListNode addLast(int data,ListNode head){
		ListNode newNode = new ListNode(data);
        newNode.next=null;
        if(head==null){
		    head=newNode;
			return head;
		}
		ListNode currNode = head;
		while(currNode.next!=null)
			currNode=currNode.next;
		currNode.next=newNode;
        return head;
	}
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> al =new ArrayList<>();
        ListNode currNode =head;
        while(currNode!=null){
            al.add(currNode.val);
            currNode=currNode.next;
        }
        head=null;
        Collections.reverse(al);
        //System.out.println(al);
        for(int i=0;i<al.size();i++){
            head=addLast(al.get(i),head);
        }
        return head;
    }
}