package multithreading;

class BookMyShow {
	static int total_tickets = 15;

	synchronized public void bookTickets(int ticket) {
		if (total_tickets >= ticket) {
			total_tickets = total_tickets - ticket;
			System.out.println(Thread.currentThread().getName() + " has bookets " + ticket
					+ " has been booked & remaining are " + total_tickets);
		} else {
			System.out.println("Ticket is not booked only " + total_tickets + " are available ");
		}
	}

}

public class MyMovieApp extends Thread {
	static BookMyShow book;
	int t;

	public void run() {
		book.bookTickets(t);
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		book = new BookMyShow();

		MyMovieApp nikita = new MyMovieApp();
		nikita.t = 3;
		nikita.start();

		MyMovieApp komal = new MyMovieApp();
		komal.t = 5;
		komal.start();

	}

}