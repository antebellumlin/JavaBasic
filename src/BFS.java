
public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 
	 * 
	 * Basic Model:
	 * 
	HashMap<Node, ArrayList> = new HashMap<>();
	Node means the vertex, ArrayList contains the vertexes connected to key vertex
	
	 * 
	public Node BFS(HashMap graph, Node start){
	
		第一步：创建queue并输入start point
		Queue<Node> q = new LinkedList<>();
		q.offer(stsrt);
		
		第二步：记录去过的点，防止走回头路陷入死循环
		Set<Node> seen = new HashSet<>();
		seen.put(start);
		
		第三步：开始循环指导queue为空
		while (q.size()>0){
		
			第四步：遍历queue
			Node tmp = q.poll();
			
			第五步：遍历当前点的相邻点
			Node[] tmp01 = graph.get(tmp);
			for (Node x:tmp01){
				if !seen.contains(x){
					q.offer(x);
					seen.add(x);
				}
			}
			System.out.print(tmp);
		}
	}
	
	*
	*
	*
	*
	*
	*
	BFS for Maze:
	****
	*
	Queue<int[]> q = new LinkedList<>();
	q.offer(start);
	int[][] directions = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
	while(!q.empty()){
		int[] tmp = q.poll();
		maze[tmp[0],tmp[1]] = -1; //visited
		if (tmp[0], tmp[1]) == dextination){
			终止条件;
		}
		for (int i = 0; i<direction.length; i++){
			int[] tmp_dir = direction[0];
			int row = tmp[0];
			int col = tmp[1];
			while(row > 0 && r < maze.length && col > 0 && maze[0].length && maze[row][col] == 0){
				row += tmp_dir[0];
				col += tmp_dir[1];
			}
			row -= tmp_dir[0];
			col -= tmp_dir[1];
			if (maze[row][col] == 0 && !q.contains(new int[] {row,col})){
				q.add(new int[] {row,col});
			}
			
		}
	}
	
	
	
	
	
	
	
	*/

}
