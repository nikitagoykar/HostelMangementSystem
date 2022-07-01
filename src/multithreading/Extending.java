package multithreading;

class MyThread extends Thread
{
   public void run()
   {
	   for(int i=1;i<=5;i++)
		   System.out.println("meassage"+i);
   }
}


class Extending {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		System.out.println(t);
		t.start();

	}

}
