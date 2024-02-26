package variableAndDataTypes;

import java.util.Scanner;

public class Variables {
	// int short char boolean byte float double 
	public static void main(String args []){
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		char c = scan.next(".").charAt(0);
		System.out.println("i="+i+"c = "+c);
		byte b=0;
		boolean  flag = true;
		boolean flag2 = false;
		System.out.print("input short");
		short shortt = scan.nextShort();
		
		System.out.println("shortt="+shortt+" flah="+flag+"flag2 = "+c +"byte b ="+b);
		
	}
}
