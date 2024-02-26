package graphPackage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphPackage {
	static class Edge{
		int src;
		int des;
		int weight;
		Edge(int src, int des, int weight){
			this.src=src;
			this.des=des;
			this.weight=weight;
		}
	}
	
	public static void createGraph(ArrayList <Edge> graph[]){
		for(int i=0; i< graph.length;i++){
			graph[i]= new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,1,2));
		
		graph[1].add(new Edge(1,2,10));
		graph[1].add(new Edge(1,3,0));
		
		graph[2].add(new Edge(2,1,2));
		graph[2].add(new Edge(2,0,10));
		graph[2].add(new Edge(2,3,-1));
		
		graph[3].add(new Edge(0,1,0));
		graph[3].add(new Edge(0,2,-1));
		
	}
	
	public static void bfsForUnconnected(ArrayList<Edge>[] graph, int V) {
        // Create queue
        Queue<Integer> queue = new LinkedList<>();

        // Create visited array of size V
        boolean[] visited = new boolean[V];

        // Start BFS traversal for all unvisited vertices
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                // Add the starting source to the queue
                queue.add(i);

                // Mark the vertex as visited
                visited[i] = true;

                // Perform BFS traversal
                while (!queue.isEmpty()) {
                    // Remove the front from the queue and name it as 'current'
                    int current = queue.remove();

                    // Process, Visit or Print the current node
                    System.out.println(current);

                    // loop through all neighbors for current 
                    // and Add only unvisited neighbors to the queue 
                    // and them as true 
                    for (Edge e : graph[current]) {
                        int neighbor = e.des;
                        if (!visited[neighbor]) {
                            queue.add(neighbor);
                            visited[neighbor] = true; // Mark the neighbor as visited when adding to the queue
                        }
                    }
                }
            }
        }
    }

	
	public static void bfs(ArrayList<Edge> graph[], int V){
		//create Q
		Queue <Integer> q = new LinkedList<>();
		
		//create visited of V length
		boolean vis[] = new boolean [V];
		
		//add starting src to Q 
		q.add(0);
		
		
		//until q is not empty
		while(!q.isEmpty()){
			
			//remove front from  Q name it as Current 
			
			int cur = q.remove();
			
			if(vis[cur]== false){
				//PVA
				System.out.println(cur);
				
				//change visited to true
				
				vis[cur] = true;
				
				//add all neigbours to Q
				for(int i =0 ; i<graph[cur].size();i++){
					Edge e = graph[cur].get(i);
					q.add(e.des);
				}
				
			}
			
			
			
		}
		
		
	}
	
	public static void dfs(ArrayList<Edge> graph[], int V){
		//create Q
		Stack <Integer> s = new Stack<>();
		
		//create visited of V length
		boolean vis[] = new boolean [V];
		
		//add starting src to Q 
		s.push(0);
		
		
		//until q is not empty
		while(!s.isEmpty()){
			
			//remove front from  Q name it as Current 
			
			int cur = s.pop();
			
			if(vis[cur]== false){
				//PVA
				System.out.println(cur);
				
				//change visited to true
				
				vis[cur] = true;
				
				//add all neigbours to Q
				for(int i =0 ; i<graph[cur].size();i++){
					Edge e = graph[cur].get(i);
					s.push(e.des);
				}
				
			}
			
			
			
		}
		
		
	}
	
	public static void dfsUtil(ArrayList<Edge> graph[],int cur, boolean vis[]){
		System.out.println(cur);
		vis[cur]=true;
		for(Edge e: graph[cur])
		{
			if(vis[e.des]==false)
				dfsUtil(graph,e.des,vis);
		}
	}
	
	public static void dfsRecursive(ArrayList<Edge> graph[],int V){
		boolean vis[] = new boolean[V];
		int cur=0;
		dfsUtil(graph,cur,vis);
	}
	
	public static void main(String[] args) {
		int V=4;
		ArrayList <Edge> graph[] = new ArrayList[V];
		
		createGraph(graph);
		
		// print all neighbours of edge 2
		
//		for(int i=0; i< graph[2].size(); i++){
//			Edge e = graph[2].get(i);
//			System.out.println("des="+ e.des +" weight= " + e.weight);
//		}
		
//		bfs(graph,V);
//		bfsForUnconnected(graph,V);
		
		dfsRecursive(graph,V);
		
	}
}
