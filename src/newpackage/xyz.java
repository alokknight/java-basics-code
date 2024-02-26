package newpackage;

public class xyz {
	public static void main(String[] args) {
	Thread t1= new Thread(new Runnable2("T1"));
	Thread t2= new Thread(new Runnable2("T2"));
	t1.start();
	t2.start();
	}
}

class Runnable2 implements Runnable{
	private String threadName;
	
	public Runnable2(String threadName){
		this.threadName=threadName;
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(threadName + "  " + i);
			
		}
	}
}