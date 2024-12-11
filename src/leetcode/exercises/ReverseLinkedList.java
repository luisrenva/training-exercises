package leetcode.exercises;

public class ReverseLinkedList {
	
	
//	public static void main (String ... args) {
////		reverseList([1,2,3,4,5]);
//		
//	}
	
	public  ListNode reverseList(ListNode listNode) {
        ListNode res = reverseList(listNode.next);
        listNode.next.next = listNode;
        listNode.next = null;
        return res;
    }
	
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

}


