package movie;
public interface Movie {
	void availableTicket(int tic);
	void booking(int tic);
	void cancle(int tic);
	String errorMessage();
}
