package multithreading;
//implementing the Runnable interface.
//Extending the thread class.

class MyRunnable implements Runnable
{ 
	 public void run()
	 {
		 for(int i=1;i<=5;i++)
			 System.out.println("message"+i);
	 }
}
 class Runannable {

	public static void main(String[] args) {
		
		 MyRunnable r=new MyRunnable();
		 Thread t=new Thread(r);
		 System.out.println(t);
	t.start();
	}
}
