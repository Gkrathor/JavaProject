package movie;
import java.util.*;
public class MovieImp implements Movie
{
	private int ticket;
	public void MovieImp(int ticket)
	{
		this.ticket=ticket;
	}
	public void availableTicket(int tic) {
		System.out.println("your ticket: "+tic);
	}
	public void booking(int tic) {
		System.out.println("YOU HAVE BOOKED TICKET IS: "+(tic-=tic));


	}
	public void cancle(int tic) {
		System.out.println("YOU HAVE BOOKED TICKET IS: "+(tic+=tic));
	}
	public String errorMessage() {
		return "Ticket Sold out";
	}
}

