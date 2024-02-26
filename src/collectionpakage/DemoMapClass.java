package collectionpakage;
import java.util.*;

public class DemoMapClass {
	public static void main(String []args){
		Map <String, String> mapobj = new HashMap<>();
		mapobj.put("a", "alok");
		mapobj.put("b", "bob");
		mapobj.put("c", "cob");
		mapobj.put("d", "dog");
		mapobj.put("e", "eog");
		mapobj.put("b", "bamboo");
		
		if(!mapobj.containsKey("b")){
			mapobj.put("b", "bombbb");
		}
		mapobj.putIfAbsent("b", "bbbbb");
		
		if(!mapobj.containsValue("dog")){
			System.out.println("dog in inside map");
		}
		
		System.out.println(mapobj.isEmpty());
		
		System.out.println(mapobj);
		
		for(Map.Entry<String, String> e : mapobj.entrySet()){
			System.out.println(e);
			
			System.out.print(e.getKey()+" ");
			System.out.println(e.getValue());
			
		}
		
		for(String key : mapobj.keySet()){
			System.out.print(key + " ");
		}
		
		for(String value :mapobj.values()){
			System.out.print(value + " ");
		}
		mapobj.clear();
		
		
		////////////////////////////////////
		//////// in sorted order  //////////
		////////////////////////////////////
		Map <String, String> treemapobj = new TreeMap<>();
		treemapobj.put("a", "alok");
		treemapobj.put("b", "bob");
		treemapobj.put("c", "cob");
		treemapobj.put("d", "dog");
		treemapobj.put("e", "eog");
		treemapobj.put("b", "bamboo");
		
		treemapobj.remove("a");
		
		if(!treemapobj.containsKey("b")){
			treemapobj.put("b", "bombbb");
		}
		treemapobj.putIfAbsent("b", "bbbbb");
		
		if(!treemapobj.containsValue("dog")){
			System.out.println("dog in inside map");
		}
		
		System.out.println(treemapobj.isEmpty());
		
		System.out.println(treemapobj);
		
		for(Map.Entry<String, String> e : treemapobj.entrySet()){
			System.out.println(e);
			
			System.out.print(e.getKey()+" ");
			System.out.println(e.getValue());
			
		}
		
		for(String key : treemapobj.keySet()){
			System.out.print(key + " ");
		}
		
		for(String value :treemapobj.values()){
			System.out.print(value + " ");
		}
		treemapobj.clear();
	}
}
