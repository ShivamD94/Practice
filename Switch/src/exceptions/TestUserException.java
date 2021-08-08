package exceptions;

public class TestUserException {

	public static void updateBalance( int amt) throws UserException 
	{
		if(amt<0)
		throw new UserException("the amount must not be negative");
		else
			System.out.println("the amount is valid no exception");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount=200;
		try {
			updateBalance(amount);
		} catch (UserException e) {
			System.out.println("exception occured in main");
			e.printStackTrace();
			
		}
	}

}
