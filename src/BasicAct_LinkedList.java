
public class BasicAct_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode root = new ListNode(1);
		int[] example = {2,3,4,5,6,7,8,9,10,11};
		ListNode tmp;
		tmp = root;
		for (int i=0; i<example.length; i++) {
			ListNode tmp2 = new ListNode(example[i]);
			tmp.next = tmp2;
			tmp = tmp.next;
		}
		printLinkedList(root);
		
		//ListNode reroot = reverseLinkedList(root);
		ListNode reroot = RecusiveReverse(root);
		printLinkedList(reroot);
	}
	
	public static void printLinkedList(ListNode root) {
		ListNode tmp = root;
		while(tmp.next != null) {
			System.out.println(tmp.val);
			tmp = tmp.next;
		}
		System.out.println(tmp.val);
	}
	
	/**
	 * Dummy Node
	 * Create a dummyNode and link it to the head, to simplify any actions 
	 * about the head.
	 * 
	 * dummy = ListNode(0);
	 * dummy.next = head;
	 * curr = head;
	 * ...
	 * return dummy.next;
	 */
	
	/**
	 * reverse a LinkedList
	 * @param head
	 * @return the head of the reversed LinkedList
	 * 
	 * need 3 tmp variables to keep the record: prev, curr, nextNode
	 * 
	 * prev = null;
	 * curr = head;
	 * while(curr!=null):
	 *     nextNode = curr.next;
	 *     curr.next = prev;
	 *     prev = curr;
	 *     curr = nextNode;
	 * return prev;
	 */
	
	public static ListNode reverseLinkedList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode nextNode;
		
		while(curr != null) {
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}
	
	public static ListNode RecusiveReverse(ListNode head) {
		if (head.next!=null) {
			ListNode second = head.next;
			head.next = null;
			ListNode rest = RecusiveReverse(second);
			second.next = head;
			return rest;
		}
		return head;
	}
	
	/**
	 * fast slow pointer
	 * For searching middle point
	 * 
	 * fast, slow = head, head
	 * while fast and fast.next:
	 *     fast = fast.next.next
	 *     slow = slow.next
	 * slow will located at the middle(odd length) or middle former(even length)
	 * (to check the type of length: fast.next==null
	 * it should start without a dummy head
	 */
	
	

}
