package movie;

public class OutOfOrderTicket extends Exception {
	private String message;
	OutOfOrderTicket(String message){
		this .message=message;
	}
	public String getMessage(){
		return message;
	}
}
