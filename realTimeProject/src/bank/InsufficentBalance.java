package bank;

class InsufficentBalance extends RuntimeException{
	private String message;
	InsufficentBalance(String message)
	{
		this .message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}

}
