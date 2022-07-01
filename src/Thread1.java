class A extends Thread 
{

	public void run()
	{

		System.out.println("Thread A Started");
		for (int i = 0; i <= 5; i++) 
		{

			System.out.println("From thread A : I =" + i);

		}
		System.out.println("EXIT FROM A");

	}

}

class B extends Thread 
{

	public void run(int j)
	{

		System.out.println("Thread B Started");
		for (int j1 = 0; j1 <= 5; j1++) 
		{

			System.out.println("From thread B : J =" + j1);

		}
		System.out.println("EXIT FROM B");

	}
}

	class C extends Thread 
	{

		public void run(int k)
		{

			System.out.println("Thread C Started");
			for (int k1 = 0; k1 <= 5; k1++) 
			{

				System.out.println("From thread C : K =" + k1);

			}
			System.out.println("EXIT FROM C");

		}

	}

	
	class Thread1
	{
		public static void main(String args[]) 
		{

			A t1 = new A();
			B t2 = new B();
			C t3 = new C();
			t1.setPriority(Thread.MAX_PRIORITY);

			t2.setPriority(t2.getPriority() + 1);
			t3.setPriority(Thread.MIN_PRIORITY);

			t1.start();
			System.out.println("Start Thread A");

			t2.start();
			System.out.println("Start Thread B");

			t3.start();
			System.out.println("Exit from main thread ");

		}
	}

