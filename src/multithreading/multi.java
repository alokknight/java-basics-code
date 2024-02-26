package multithreading;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class multi extends Thread{
	public void run(){
		System.out.println("multithreading using Thread class");
		System.out.println(Thread.currentThread().getName());
		try {
            File Obj = new File("myfile.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: " + Obj.getName());   
            }
            else {
                System.out.println("File already exists.");
            }
            FileWriter filewriter = new FileWriter("myfile.txt");
            filewriter.write("Files in Java are seriously good!!");
            filewriter.close();
                System.out.println("Successfully written.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
	}
}
class multi2 implements Runnable{

	@Override
	public void run() {
		System.out.println("multithreding using Runnable interface");
		System.out.println(Thread.currentThread().getName());
		File F = new File("myfile.txt");
		try {
			Scanner reader = new Scanner(F);
			while(reader.nextLine() != null){
				String s = reader.nextLine();
				System.out.println(s);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}