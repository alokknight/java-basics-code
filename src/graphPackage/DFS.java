package graphPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import graphPackage.GraphPackage.Edge;



/// bfs is like level order traversal


public class DFS {
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
		
		graph[3].add(new Edge(3,1,0));
		graph[3].add(new Edge(3,2,-1));
		
	}
	
	
//	public static void dfs(ArrayList<Edge>graph[],int V){
//		
//
//		Stack<Integer>  stack = new Stack<>();
//		
//		boolean vis[]= new boolean[V];
//		
//		for(int i=0; i< V; i++){
//			if(!vis[i]){
//				stack.push(i);
//				vis[i]=true;
//				while(!stack.isEmpty()){
//					int cur= stack.pop();
//					
//					System.out.println(cur);
//					
//					for(Edge e : graph[cur]){
//						int neighbor= e.des;
//						if(!vis[neighbor]){
//							stack.push(neighbor);
//							vis[neighbor]=true;
//						}
//					}
//				}
//			}
//		}
//	}
	
	public static void dfs(ArrayList<Edge>[] graph, int V) {
	    Stack<Integer> stack = new Stack<>();
	    boolean[] vis = new boolean[V];

	    for (int i = 0; i < V; i++) {
	        if (!vis[i]) {
	            stack.push(i);
	            vis[i] = true;

	            while (!stack.isEmpty()) {
	                int cur = stack.pop();
	                System.out.println(cur);

	                for (Edge e : graph[cur]) {
	                    int neighbor = e.des;
	                    if (!vis[neighbor]) {
	                        stack.push(neighbor);
	                        vis[neighbor] = true;
	                    }
	                }
	            }
	        }
	    }
	}

	
//	;;;;;;;;;;;;;;;;;;;;;;
	public static void dfsUtil(ArrayList<Edge> graph[], boolean vis[], int cur){
		System.out.println(cur);
		vis[cur]=true;
		for(Edge e: graph[cur])
		{
			if(vis[e.des]==false)
				dfsUtil(graph,vis,e.des);
		}
	}
	
	public static void dfsRecursive(ArrayList<Edge> graph[],int V){
		boolean vis[] = new boolean[V];
		int cur=0;
		dfsUtil(graph,vis, cur);
	}
//	...................
	
//	public static void dfsRecursive(ArrayList<Edge> graph[],int V){
//		boolean vis[] = new boolean[V];
//		int cur=0;
//		dfsutil(graph,vis,cur);	
//	}
//	public static void dfsutil(ArrayList<Edge> graph[], boolean vis[], int cur){
//		System.out.print(cur);
//		vis[cur]=true;
//		for(Edge e : graph[cur]){
//			if(!vis[e.des]){
//				dfsutil(graph,vis,e.des);
//			}
//		}
//		
//	}
	
	
	
	public static void main(String args[]){
		int V=4;
		ArrayList<Edge> graph[]= new ArrayList[V];
		
		createGraph(graph);
		
		dfs(graph,V);
		dfsRecursive(graph,V);
	}
}
