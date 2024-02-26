package InputOutput;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerReader {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String name = reader.readLine();
	int     age = Integer.parseInt(reader.readLine());
	
	System.out.println("name = " + name + " age= "+age );
	reader.close();
}
}
