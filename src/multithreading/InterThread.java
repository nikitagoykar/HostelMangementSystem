package multithreading;

class MyEarning extends Thread {
	int total = 0;

	public void run() {
		for (int i = 1; i <= 10; i++) {
			total = total + 100;
		}
		System.out.println("total amount is  " + total);
	}
}

public class InterThread {

	public static void main(String[] args) {
		MyEarning a = new MyEarning();
		a.start();
	}

}
