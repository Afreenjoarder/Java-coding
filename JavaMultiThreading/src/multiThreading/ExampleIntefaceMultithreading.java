package multiThreading;

class A implements Runnable{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {Thread.sleep(1000);}catch(Exception e){};
			System.out.println(" ");
		}
		
	}
	
}

class B implements Runnable{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {Thread.sleep(1000);}catch(Exception e){};
		}
		
	}
}

public class ExampleIntefaceMultithreading {

	public static void main(String[] args) {
		
		Runnable ob1=new A();
		Runnable ob2=new B();
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.setName("player 1");
		t1.setPriority(Thread.MIN_PRIORITY);
		
		
		
		
		t2.setName("player 2");
		t2.setPriority(Thread.NORM_PRIORITY);
		
		 
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e){};
		t2.start();
		
		
		
	}

}
