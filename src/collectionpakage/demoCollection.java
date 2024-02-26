package collectionpakage;

import java.util.ArrayList;

public class demoCollection {
	public static void main(String[] args) {
		ArrayList<String> arraylistobj = new ArrayList<>();

		arraylistobj.add("alok");
		arraylistobj.add("patel");
		arraylistobj.add("xyz");
		arraylistobj.add("pqr");
		arraylistobj.add("rst");
		arraylistobj.add("uvw");
		arraylistobj.add("alok");
		System.out.println(arraylistobj);

		ArrayList<String> newarraylistobj = new ArrayList<>();
		newarraylistobj.add("alok");
		System.out.println(newarraylistobj);

		arraylistobj.addAll(newarraylistobj);
		System.out.println(arraylistobj);
		arraylistobj.remove("alok");
		System.out.println(arraylistobj);

		arraylistobj.remove(String.valueOf("alok"));
		System.out.println(arraylistobj);

		arraylistobj.set(2, "setValue");

		System.out.println(arraylistobj.contains("xyz"));

		for (int i = 0; i < arraylistobj.size(); i++) {
			System.out.print(arraylistobj.get(i) + " ");
		}

		for (String s : arraylistobj) {
			System.out.print("using for each loop: " + s + " ");
		}

		arraylistobj.clear();
		System.out.println(arraylistobj);

	}
}
