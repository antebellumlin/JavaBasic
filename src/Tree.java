import java.util.*;
public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode l1 = new TreeNode(4);
		TreeNode l2 = new TreeNode(3);
		TreeNode l3 = new TreeNode(2);
		TreeNode l4 = new TreeNode(1);
		TreeNode l5 = new TreeNode(5);
		TreeNode l6 = new TreeNode(8);
		TreeNode l7 = new TreeNode(7);
		
		l1.left = l2;
		l1.right = l3;
		l2.left = l4;
		l3.left = l5;
		l3.right = l6;
		l5.left = l7;
		
		List<Integer> preorder = preorderTraversal(l1);
		
		System.out.println(preorder);
		
		List<Integer> inorder = inorderTraversal(l1);
		
		System.out.println(inorder);
		
		List<Integer> postorder = postorderTraversal(l1);
		
		System.out.println(postorder);
		
		List<Integer> test = new ArrayList<>();
		//Deque<Integer> teststack = new ArrayDeque<Integer>();
		Deque<Integer> teststack = new ArrayDeque<Integer>();
		
		teststack.push(1);
		teststack.push(2);
		teststack.push(3);
		teststack.push(4);
		teststack.push(5);
		teststack.push(6);
		teststack.push(7);
		
		test.add(teststack.pop());
		test.add(teststack.pop());
		test.add(teststack.pop());
		test.add(teststack.pop());
		test.add(teststack.pop());
		test.add(teststack.pop());
		test.add(teststack.pop());
		
		System.out.println(test);
		
		
		

	}
	static public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) { val = x; }
	}
	/**
	 * 
	 * Divide and conqur
	public int travel(Node root) {
		if (root == null) {
			//do something
		}
		int left = travel(root.left);
		int right = travel(root.right);
		
		int res  // something with left and right
		return res;
	}
	*/
	
	/**
	 * 
	 * get the height of a tree
	 */ 
	
	//travel with recursion
	public int getheight(TreeNode root) {
		if ( root == null) {
			return 0;
		}
		int left = getheight(root.left);
		int right = getheight(root.right);
		
		return Math.max(left, right) + 1;
	}
	
	//traverse without recursion(pre-order;
	
	static public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<>();
		if (root == null) return result;
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.empty()) {
			TreeNode node = s.pop();
			result.add(node.val);
			if (node.right != null) s.push(node.right);
			if (node.left != null) s.push(node.left);
		}
		return result;
	}
	
	//traverse without recursion in-order
	static public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		while(root!=null||!s.empty()) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				root = s.pop();
				result.add(root.val);
				root = root.right;
			}
		}
		return result;
	}
	
	static public List<Integer> postorderTraversal(TreeNode root){
		ArrayList<Integer> result = new ArrayList<>();
		if (root == null) return result;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			result.add(node.val);
			if(node.left !=null) stack.push(node.left);
			if(node.right != null) stack.push(node.right);
		}
		Collections.reverse(result);
		
		return result;
	}
	
	
	
	/**
	 * 
	 * get the min height of a tree
	 * 
	public int getMinHeight(Node root) {
		if (root == null) {
			return 0;
		}
		
		int left = getMinHeight(root.left);
		int right = getMinHeight(root.right);
		
		if (root.left == null) {
			return right+1;
		}
		if (root.right == null) {
			return left +1;
		}
		return Math.min(left, right)+1;
	}
	*/
	
	
	/**
	public boolean isbalanced(Node root) {
		return check(root) == -1;
	}
	public int check(Node root) {
		if(root == null) {
			return -1;
		}
		int left = check(root.left);
		int right = check(root.right);
		
		if (left == -1 || right == -1 || abs(left-right)>1) {
			return -1;
		}else {
			return Math.max(left,right)+1;
		}
	}
	*/
	
	
	
	
	
}
