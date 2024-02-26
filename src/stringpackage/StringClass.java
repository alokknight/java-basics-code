package stringpackage;

public class StringClass {
	public void stringDemoFun(){
		String[] str = {"alok", "alomm", "ok","dk"};
		for(String s : str){
			if(s.startsWith("al")){
				System.out.println(s);
			}
		}
		String s= "alokpatelalok";
		System.out.println(s.indexOf('k',3));
		String s2="cancat";
		String s3= s.concat(s2);
		System.out.println(s3);
		String s4= s.replace('a', 'b');
		System.out.println(s4);  //blokpbtelblok
		System.out.println(s.toUpperCase());
		System.out.println(s.compareTo("alokpatelalok"));
		
	}
	
}
