
public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 HashMap<Node, ArrayList> = new HashMap<>();
	 Node means the vertex, ArrayList contains the vertexes connected to key vertex
	 public DFS (HashMap graph, Node start){
	 	Stack<Node> stack = new Stack();
	 	stack.add(start);
	 	HashSet<Node> Seen = new HashSet<>();
	 	Seen.add(start);
	 	while(!stack.empty()){
	 		Node tmp = stack.poll();
	 		Node[] tmp_con = graph.get(tmp);
	 		for (Node x:tmp_con){
	 			if (!Seen.contains(x)){
	 				stack.add(x);
	 				Seen.add(x);
	 			}
	 		System.out.print(tmp);
	 		}	
	 	}
	 }
	 */

}
