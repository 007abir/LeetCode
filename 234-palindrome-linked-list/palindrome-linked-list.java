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
    public boolean isPalindrome(ListNode head) {
        String op="";
        String left="";
        String right="";
        int len=findlen(head);
        int mid=len/2;
        int[] array=create_array(head,len);
        boolean flag=true;
        for(Integer i:array){
            op+=Integer.toString(i);
        }
        if(len%2==0){
            left=op.substring(0,mid);
            for(int i=op.length()-1;i>=mid;i--){
            right+=op.charAt(i);
        }
        }

           
        if(len%2!=0){
            left=op.substring(0,mid);
            for(int i=op.length()-1;i>=mid+1;i--){
            right+=op.charAt(i);
        }
        }
        return left.equals(right);
    }

    public static int findlen(ListNode lst){
        ListNode temp_head=lst;
        int cnt=0;
        while(temp_head!=null){
            cnt+=1;
            temp_head=temp_head.next;
        }
        return cnt;
    }

    public static int[] create_array(ListNode lst,int len){
        int[] arr= new int[len];
        ListNode temp=lst;
        int cnt=0;
        while(temp!=null){
            arr[cnt]=temp.val;
            cnt+=1;
            temp=temp.next;
        }
        return arr;
    }
}