package graphPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



/// bfs is like level order traversal


public class BFS {
	static class Edge{
		int src;
		int des;
		int weight;
		Edge(int src, int des, int weight){
			this.des=des;
			this.src=src;
			this.weight= weight;
		}
	}
	
	
	public static void createGraph(ArrayList<Edge>graph[]){
		for(int i=0; i< graph.length;i++){
			graph[i]=new ArrayList<Edge>();
		}
		
//		graph[0].add(new Edge(0,2,3));
//		graph[1].add(new Edge(1,2,3));
//		graph[1].add(new Edge(1,2,3));
//		graph[2].add(new Edge(2,2,3));
//		graph[2].add(new Edge(2,2,3));
//		graph[2].add(new Edge(2,2,3));
//		graph[3].add(new Edge(3,2,3));
//		graph[3].add(new Edge(3,2,3));
//		graph[3].add(new Edge(3,2,3));
//		graph[4].add(new Edge(4,2,3));
//		graph[4].add(new Edge(4,2,3));
//		graph[4].add(new Edge(4,2,3));
//		graph[4].add(new Edge(4,2,3));
//		graph[5].add(new Edge(5,2,3));
//		graph[5].add(new Edge(5,2,3));
//		graph[5].add(new Edge(5,2,3));
//		graph[5].add(new Edge(5,2,3));
		
//		------------------------------
		
		graph[0].add(new Edge(0,1,2));
		
		graph[1].add(new Edge(1,2,10));
		graph[1].add(new Edge(1,3,0));
		
		graph[2].add(new Edge(2,1,2));
		graph[2].add(new Edge(2,0,10));
		graph[2].add(new Edge(2,3,-1));
		
		graph[3].add(new Edge(0,1,0));
		graph[3].add(new Edge(0,2,-1));
		
	}
	
	
	public static void bfs(ArrayList<Edge>graph[],int V){
		
//		create q
//		create vis arr
		Queue<Integer>  q = new LinkedList<>();
		
		boolean vis[]= new boolean[V];
		
		for(int i=0; i< V; i++){
			if(!vis[i]){
				q.add(i);
				vis[i]=true;
				while(!q.isEmpty()){
					int cur= q.remove();
					
					System.out.println(cur);
					
					for(Edge e : graph[cur]){
						int neighbor= e.des;
						if(!vis[neighbor]){
							q.add(neighbor);
							vis[neighbor]=true;
						}
					}
				}

			}
		}

	}
	
	
	
	public static void main(String args[]){
		int V=6;
		ArrayList<Edge> graph[]= new ArrayList[V];
		
		createGraph(graph);
		
		bfs(graph,V);
	}
}
