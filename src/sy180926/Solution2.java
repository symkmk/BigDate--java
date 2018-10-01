package sy180926;

public class Solution2
{
	public static void main(String[] args)
	{
		ListNode l1=new ListNode(12);
		ListNode l2=new ListNode(35);
		
		System.out.println(new Solution2().addTwoNumbers(l1, l2));
	}
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        if(l1==null) return l2;
	        if(l2==null) return l1;
	        
	        ListNode l3 = new ListNode(0);
	        ListNode tail = l3;
	        
	        int flag = 0;
	        while(l1!=null || l2!=null){
	            int num1 = 0, num2 = 0;
	            if(l1 != null){
	                num1 = l1.val;
	                l1 = l1.next;
	            }
	            if(l2 != null){
	                num2 = l2.val;
	                l2 = l2.next;
	            }
	            int num = num1 + num2 + flag;
	            flag = num / 10;
	            num = num % 10;
	            ListNode node = new ListNode(num);
	            tail.next = node;
	            tail = node;
	        }
	        if(flag == 1){
	            ListNode node = new ListNode(1);
	            tail.next = node;
	            tail = node;
	        }
	        tail.next = null;
	        return l3.next;
	    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
