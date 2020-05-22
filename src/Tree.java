
public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	 * 
	public int getheight(Node root) {
		if ( root == null) {
			return 0;
		}
		int left = getheight(root.left);
		int right = getheight(root.right);
		
		return Math.max(left, right) + 1;
	}
	*/
	
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
