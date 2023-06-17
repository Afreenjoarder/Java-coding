package multiThreading;

class daemon implements Runnable{
	public void run() {
		
		System.out.println("Name ="+Thread.currentThread().getName());
		System.out.println("Daemon  ="+Thread.currentThread().isDaemon());
	}
	
	
}

public class ExampleDaemon {

	public static void main(String[] args) {
		Runnable ob1=new daemon();
		Runnable ob2=new daemon();
	
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		
		t1.setDaemon(true);
	
		t2.setDaemon(false);
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e){};
		t2.start();
		
	}

}
